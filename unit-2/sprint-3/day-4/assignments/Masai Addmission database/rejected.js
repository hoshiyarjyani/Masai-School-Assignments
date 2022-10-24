// All the Code for the Rejected page goes here
var rejectArr = JSON.parse(localStorage.getItem("admission-rejected")) || [];

displayTable();
function displayTable() {
  for (let i = 0; i < rejectArr.length; i++) {
    var row = document.createElement("tr");
    var td1 = document.createElement("td");
    td1.innerText = rejectArr[i].name;
    var td2 = document.createElement("td");
    td2.innerText = rejectArr[i].email;
    var td3 = document.createElement("td");
    td3.innerText = rejectArr[i].course;
    var td4 = document.createElement("td");
    td4.innerText = rejectArr[i].gender;
    var td5 = document.createElement("td");
    td5.innerText = rejectArr[i].mobile;

    row.append(td1, td2, td3, td4, td5);
    document.querySelector("tbody").append(row);
  }
}
