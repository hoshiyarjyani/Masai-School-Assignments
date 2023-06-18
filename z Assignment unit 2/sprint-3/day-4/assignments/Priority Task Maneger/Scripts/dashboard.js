// Write code related to dashboard page here

var dataArr = JSON.parse(localStorage.getItem("task-list")) || [];
let progressArr = JSON.parse(localStorage.getItem("priority-list")) || [];
let tbody = document.querySelector("tbody");

function displayTable(data) {

    tbody.innerHTML = null;

  data.forEach(function (element, index) {
    let row = document.createElement("tr");

    let name = document.createElement("td");
    name.innerText = element.name;
    let desc = document.createElement("td");
    desc.innerText = element.desc;
    let Sdate = document.createElement("td");
    Sdate.innerText = element.startDate;
    let Edate = document.createElement("td");
    Edate.innerText = element.endDate;
    let priority = document.createElement("td");
    priority.innerText = element.priority;


    let Add = document.createElement("td");
    Add.innerText = "Add";

    Add.addEventListener("click", function () {
      progressArr.push(element);
      localStorage.setItem("priority-list", JSON.stringify(progressArr));
      deleteRow(dataArr, index);
    });

    row.append(name, desc, Sdate, Edate, priority, Add);
    tbody.append(row);
  });
}



function deleteRow(data, index) {
  data.splice(index, 1);
  localStorage.setItem("task-list", JSON.stringify(data));
  displayTable(data);
  document.querySelector("#task-count").innerText=dataArr.length;
}


let filter = document.querySelector("#filter");

filter.addEventListener("change",function(){
   let filterData =  dataArr.filter(function(elem){
    if(filter.value==""){
        return elem.priority;
    }else{
        return elem.priority === filter.value;
    }
   });
   displayTable(filterData);
});




document.querySelector("#task-count").innerText=dataArr.length;
displayTable(dataArr);