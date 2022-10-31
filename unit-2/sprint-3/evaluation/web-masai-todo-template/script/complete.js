// Write all the JS Code related to Home Page Here 


let taskcompleteArr = JSON.parse(localStorage.getItem("task-completed")) || [];

let favArr = JSON.parse(localStorage.getItem("task-favorites")) || [];

displayTable(taskcompleteArr);
function displayTable(data){
    
    document.querySelector("tbody").innerHTML="";

   data.forEach(function(element,index){
    let row = document.createElement("tr");
    let td1 = document.createElement("td");
    td1.innerText = element.taskname;

    let td2 = document.createElement("td");
    td2.innerText = element.type;

    let td3 = document.createElement("td");
    td3.innerText = element.date;

    let td4 = document.createElement("td");
    td4.innerText = element.priority;

    let td5 = document.createElement("td");
    td5.innerText = "Add";

    td5.addEventListener("click",function(){
        favArr.push(element);
        localStorage.setItem("task-favorites",JSON.stringify(favArr));
        deleteRow(taskcompleteArr,index);
    });

    row.append(td1,td2,td3,td4,td5);
    document.querySelector("tbody").append(row);
   });
}

function deleteRow(data,index){
    data.splice(index,1);
    localStorage.setItem("tasks",JSON.stringify(data));
    displayTable(data);
}

let filter = document.querySelector("#filter");
filter.addEventListener("change",function(){
    let filterdata = taskcompleteArr.filter(function(elem){
  if(filter.value==""){
    return elem.priority;
  }else{
    return elem.priority === filter.value;
  }
    });
    displayTable(filterdata);
});