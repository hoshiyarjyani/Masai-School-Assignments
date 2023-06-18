// Write code related to Done page here

var doneArr = JSON.parse(localStorage.getItem("done-list")) || [];

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
    row.append(name, desc, Sdate, Edate, priority);
    tbody.append(row);
  });
}
displayTable(doneArr);
