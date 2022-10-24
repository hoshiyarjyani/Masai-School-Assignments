// All the Code for All Students Page Goes Here
var detailArr = JSON.parse(localStorage.getItem("admission")) || [];
var acceptArr = JSON.parse(localStorage.getItem("admission-accepted")) || [];
var rejectArr = JSON.parse(localStorage.getItem("admission-rejected")) || [];
displayTable();
function displayTable() {
  for (let i = 0; i < detailArr.length; i++) {
    var row = document.createElement("tr");
    var td1 = document.createElement("td");
    td1.innerText = detailArr[i].name;
    var td2 = document.createElement("td");
    td2.innerText = detailArr[i].email;
    var td3 = document.createElement("td");
    td3.innerText = detailArr[i].course;
    var td4 = document.createElement("td");
    td4.innerText = detailArr[i].gender;
    var td5 = document.createElement("td");
    td5.innerText = detailArr[i].mobile;
    var td6 = document.createElement("td");
    td6.innerText = "Accpet";
    td6.style.backgroundColor = "green";
    td6.addEventListener("click", function () {
      acceptArr.push(detailArr[i]);
      localStorage.setItem("admission-accepted", JSON.stringify(acceptArr));
   
   
   
      deleteData(detailArr,i);



    });

    var td7 = document.createElement("td");
    td7.innerText = "Reject";
    td7.style.backgroundColor = "red";
    td7.addEventListener("click", function () {
      rejectArr.push(detailArr[i]);
      localStorage.setItem("admission-rejected", JSON.stringify(rejectArr));
    });

    row.append(td1, td2, td3, td4, td5, td6, td7);
    document.querySelector("tbody").append(row);
  }
}





function deleteData(data,index){
data.splice(index,1);
localStorage.setItem("addmission",JSON.stringify(data));
displayTable(data);
}