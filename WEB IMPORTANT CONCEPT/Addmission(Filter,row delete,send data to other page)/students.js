// All the Code for All Students Page Goes Here
var detailArr = JSON.parse(localStorage.getItem("admission")) || [];
var acceptArr = JSON.parse(localStorage.getItem("admission-accepted")) || [];
var rejectArr = JSON.parse(localStorage.getItem("admission-rejected")) || [];

let tbody = document.querySelector("tbody");

let filter = document.querySelector("#filter");

function displayTable(data) {
  tbody.innerHTML = null;

  data.forEach(function (element, index) {
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
    var td6 = document.createElement("td");
    td6.innerText = "Accpet";
    td6.style.backgroundColor = "green";
    td6.addEventListener("click", function () {
      acceptArr.push(element);
      localStorage.setItem("admission-accepted", JSON.stringify(acceptArr));
      deleteRow(detailArr, index);
    });

    var td7 = document.createElement("td");
    td7.innerText = "Reject";
    td7.style.backgroundColor = "red";
    td7.addEventListener("click", function () {
      rejectArr.push(element);
      localStorage.setItem("admission-rejected", JSON.stringify(rejectArr));
      deleteRow(detailArr, index);
    });

    row.append(td1, td2, td3, td4, td5, td6, td7);
    tbody.append(row);
  });
}

function deleteRow(data, index) {
  data.splice(index, 1);
  localStorage.setItem("admission", JSON.stringify(data));
  displayTable(data);
}

filter.addEventListener("change", function () {
  let filterData = detailArr.filter(function (elem) {
    if (filter.value === "all" || filter.value === "") {
      return elem.course;
    } else {
      return elem.course === filter.value;
    }
  });
  displayTable(filterData);
});

displayTable(detailArr);

// var row = document.createElement("tr");
// var td1 = document.createElement("td");
// td1.innerText = detailArr[i].name;
// var td2 = document.createElement("td");
// td2.innerText = detailArr[i].email;
// var td3 = document.createElement("td");
// td3.innerText = detailArr[i].course;
// var td4 = document.createElement("td");
// td4.innerText = detailArr[i].gender;
// var td5 = document.createElement("td");
// td5.innerText = detailArr[i].mobile;
// var td6 = document.createElement("td");
// td6.innerText = "Accpet";
// td6.style.backgroundColor = "green";
// td6.addEventListener("click", function () {
//   acceptArr.push(detailArr[i]);
//   localStorage.setItem("admission-accepted", JSON.stringify(acceptArr));
// });

// var td7 = document.createElement("td");
// td7.innerText = "Reject";
// td7.style.backgroundColor = "red";
// td7.addEventListener("click", function () {
//   rejectArr.push(detailArr[i]);
//   localStorage.setItem("admission-rejected", JSON.stringify(rejectArr));
// });

// row.append(td1, td2, td3, td4, td5, td6, td7);
// document.querySelector("tbody").append(row);
