// Write all the JS Code related to Home Page Here 
// Write all the JS Code related to Home Page Here 


let todoArr = JSON.parse(localStorage.getItem("tasks")) || [];

let taskcompleteArr = JSON.parse(localStorage.getItem("task-completed")) || [];

document.querySelector("form").addEventListener("submit",mytodo);
displayTable(todoArr);

function mytodo(event){
    event.preventDefault();
    let taskname = document.querySelector("#name").value;
    let type = document.querySelector("#type").value;
    let date = document.querySelector("#date").value;
    let priority = document.querySelector("#priority").value;
    if(taskname=="" || type=="" ||date=="" || priority==""){
        alert("complete the form");
    }else{
    let taskobj = {taskname,type,date,priority};
    todoArr.push(taskobj);
    localStorage.setItem("tasks",JSON.stringify(todoArr));
    displayTable(todoArr);
    }
    
}


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
    td5.innerText = "Complete";

    td5.addEventListener("click",function(){
        taskcompleteArr.push(element);
        localStorage.setItem("task-completed",JSON.stringify(taskcompleteArr));
        deleteRow(todoArr,index);
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