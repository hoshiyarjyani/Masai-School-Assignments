// All the Code for the Admitted page goes here

var acceptArr = JSON.parse(localStorage.getItem("admission-accepted")) || [];

function displayTable(data) {
   data.forEach(function(element){
    var row = document.createElement("tr");
    var td1 = document.createElement("td");
    td1.innerText = element.name;
    var td2 = document.createElement("td");
    td2.innerText = element.email;
    var td3 = document.createElement("td");
    td3.innerText = element.course;
    var td4 = document.createElement("td");
    td4.innerText = element.gender;
    var td5 = document.createElement("td");
    td5.innerText = element.mobile;
    row.append(td1, td2, td3, td4, td5);
    document.querySelector("tbody").append(row);
   });
  }
displayTable(acceptArr); 