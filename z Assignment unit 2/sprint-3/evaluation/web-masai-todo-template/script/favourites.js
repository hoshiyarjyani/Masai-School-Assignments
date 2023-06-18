

let favArr = JSON.parse(localStorage.getItem("task-favorites")) || [];


function displayTable(data){
    
    document.querySelector("tbody").innerHTML="";

   data.forEach(function(element){
    let row = document.createElement("tr");
    let td1 = document.createElement("td");
    td1.innerText = element.taskname;

    let td2 = document.createElement("td");
    td2.innerText = element.type;

    let td3 = document.createElement("td");
    td3.innerText = element.date;

    let td4 = document.createElement("td");
    td4.innerText = element.priority;

    
    row.append(td1,td2,td3,td4);
    document.querySelector("tbody").append(row);
   });
}

displayTable(favArr);
