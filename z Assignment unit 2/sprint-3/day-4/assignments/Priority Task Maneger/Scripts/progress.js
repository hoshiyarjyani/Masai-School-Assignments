// Write code for the Progress page here

var progressArr = JSON.parse(localStorage.getItem("priority-list")) || [];
let doneArr = JSON.parse(localStorage.getItem("done-list")) || [];

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
      doneArr.push(element);
      localStorage.setItem("done-list", JSON.stringify(doneArr));
      deleteRow(progressArr, index);
    });

    row.append(name, desc, Sdate, Edate, priority, Add);
    tbody.append(row);
  });
}

function deleteRow(data, index) {
  data.splice(index, 1);
  localStorage.setItem("priority-list", JSON.stringify(data));
  displayTable(data);
}

displayTable(progressArr);
