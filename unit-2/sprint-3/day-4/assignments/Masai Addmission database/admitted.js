// All the Code for the Admitted page goes here

var acceptArr = JSON.parse(localStorage.getItem("admission-accepted")) || [];

displayTable();
function displayTable() {
  for (let i = 0; i < acceptArr.length; i++) {
    var row = document.createElement("tr");
    var td1 = document.createElement("td");
    td1.innerText = acceptArr[i].name;
    var td2 = document.createElement("td");
    td2.innerText = acceptArr[i].email;
    var td3 = document.createElement("td");
    td3.innerText = acceptArr[i].course;
    var td4 = document.createElement("td");
    td4.innerText = acceptArr[i].gender;
    var td5 = document.createElement("td");
    td5.innerText = acceptArr[i].mobile;
    
    row.append(td1, td2, td3, td4, td5);
    document.querySelector("tbody").append(row);
  }
}
