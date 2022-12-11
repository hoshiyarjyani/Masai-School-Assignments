async function FetchTodoData(data_perpage=5,page_number=1) {
    try {
          let fetch_todo_request = await fetch(
                `http://localhost:9090/todos?_limit=${data_perpage}&_page=${page_number}`,
                {
                      method: "GET",
                      headers: {
                            "Content-Type": "application/json",
                            Authorization: `Bearer ${sessionStorage.getItem(
                                  "access_token"
                            )}`,
                      },
                }
          );

          if (fetch_todo_request.ok) {
                let total_data_count= fetch_todo_request.headers.get("x-total-count");
                let total_page_show = Math.ceil(total_data_count/data_perpage)
                let real_data = await fetch_todo_request.json();
                RenderData(real_data);
                renderPaginationButtons(total_page_show,page_number);
          } else {
                alert(
                      "Bad request! Maybe you are missing your access token."
                );
          }
    } catch (error) {
          alert("Something went wrong!! Please try again later.");
    }
}

window.addEventListener("load", () => {
    let data_per_page = document.querySelector(".select-tag").value;
    FetchTodoData(data_per_page);
});

let select_item_per_page = document.querySelector(".select-tag");
select_item_per_page.addEventListener("change", (event) => {
    FetchTodoData(event.target.value);
});

// Show the data in the DOM, that you have fetched.

function RenderData(all_datas) {
    let mainContainer = document.querySelector(".data-list-wrapper");
    mainContainer.innerHTML = "";

    let new_formed_data = all_datas.map((item) => {
          return `<div class="task">
      <div class="content">
          <input type="text" class="text" value="${item.title}" readonly>
      </div>
      <div class="actions">
          <button class="toggle" data-id=${item.id} data-completed=${item.completed}>
                 ${item.completed === true ? "Completed" : "Not completed"}
          </button>
          <button class="edit" data-id=${item.id} >Edit</button>
          <button class="delete" data-id=${item.id} >Delete</button>
      </div>
  </div>`;
    });

    mainContainer.innerHTML = new_formed_data.join(" ");

    let all_delete_btn = document.querySelectorAll(".delete");
    for(let btn of all_delete_btn){
        btn.addEventListener("click",(event)=>{ 
          let data_id = event.target.dataset.id;
          console.log(data_id,typeof data_id);
          DeleteBtn(data_id);
      });
    }

  //   AddEventListner to Toggle button
  let all_toggle_btn = document.querySelectorAll(".toggle");
  for(let btn of all_toggle_btn){
      btn.addEventListener("click", (event)=>{
          let item_id = event.target.dataset.id;
          let item_status = event.target.dataset.completed==="true" ? false : true;
          EditRequest(item_id,item_status,"completed");
      })
  }


  //   Adding event listner to all Edit buttons
  let all_edit_btn = document.querySelectorAll(".edit");
  for(let btn of all_edit_btn){
    btn.addEventListener("click", (event)=>{
      let item_id = event.target.dataset.id;
      let input_tag = event.path[2].children[0].children[0];
      if(event.target.innerText==="EDIT"){
          event.target.innerText = "SAVE";
          input_tag.removeAttribute("readonly");
          input_tag.focus();
      }else{
          event.target.innerText = "EDIT";
          input_tag.readOnly = true;
          EditRequest(item_id,input_tag.value,"title");
      }
    });
  }
}


async function EditRequest(id,new_status,key_name){
  try {
      
      let toggle_request = await fetch(`http://localhost:9090/todos/${id}`,{
          method : "PATCH",
          headers : {
              "Content-Type" : "application/json",
              Authorization: `Bearer ${sessionStorage.getItem("access_token")}`
          },
          body : JSON.stringify({[key_name] : new_status})
      })

      
      if(toggle_request.ok){
          let data_per_page = document.querySelector(".select-tag").value;
          FetchTodoData(data_per_page);
      }
  } 
  
  catch (error) {
      alert("You are not allowed to Toggle it.");	
  }
}


async function DeleteBtn(id){
  try {
      let delete_request = await fetch(`http://localhost:9090/todos/${id}`,{
          method : "DELETE",
          headers : {
              Authorization: `Bearer ${sessionStorage.getItem("access_token")}`
          }
      });
      if(delete_request.ok){
          let data_per_page = document.querySelector(".select-tag").value;
          FetchTodoData(data_per_page);
      }
  }
  
  catch (error) {
      alert("You don't have access.")	
  }
}



const add_todo_btn = document.querySelector(".create_todo");
add_todo_btn.addEventListener("submit",(event)=>{
  event.preventDefault();
  PostRequest();
})


async function PostRequest(){
  try {
      let todo_title = document.querySelector("#title");
      let todo_status = document.querySelector("#completed");
      
      let status_val = todo_status.value==="true" ?true : false;
      let todoObj = {
          [todo_title.id] : todo_title.value,
          [todo_status.id] : status_val
      }

      let post_request = await fetch("http://localhost:9090/todos",{
          method : "POST",
          headers : {
              "Content-Type": "application/json",
              Authorization: `Bearer ${sessionStorage.getItem("access_token")}`
          },
          body : JSON.stringify(todoObj)
      })

      if(post_request.ok){
          let total_item_per_page = document.querySelector(".select-tag").value;
          FetchTodoData(total_item_per_page);
      }
  } 
  
  catch (error) {
      alert("Something went wrong. Not able to Post your data.")	
  }
}



// PAGINTAION PART

let paginationWrapper = document.querySelector("#pagination-wrapper");

function renderPaginationButtons(total_pages){
console.log(total_pages)
  paginationWrapper.innerHTML = `
    <div className="pagination-btn-list">
    ${CreatePagButton(total_pages).join(" ")}
    </div>
  `;
  // handle click of pagination-btn(s)
  let paginationButtons =  document.querySelectorAll('.pagination-btn');
  for (let paginationButton of paginationButtons) {
    paginationButton.addEventListener('click', function(e){
      let page_number = e.target.dataset.id;
      let page_limit = document.querySelector(".select-tag").value;
      FetchTodoData(page_limit,page_number);
    })
  }
}




function getAsButton(text, cls, dataId ) {
  return `<button class="${cls}" ${dataId ? `data-id = ${dataId}` : ''} >${text}</button>`
}

function CreatePagButton(total_page){
 let array = [];
 for(let page=1; page<=total_page;page++){
     array.push(getAsButton(page,"pagination-btn",page))
 }
 return array;
}


