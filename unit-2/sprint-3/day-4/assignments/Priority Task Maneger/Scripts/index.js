// Write code related to Home page here
let dataArr = JSON.parse(localStorage.getItem("task-list")) || [];
document.querySelector("form").addEventListener("submit", addData);
function addData() {
  let name = document.querySelector("#name").value;
  let desc = document.querySelector("#desc").value;
  let startDate = document.querySelector("#start").value;
  let endDate = document.querySelector("#end").value;
  let priority = document.querySelector("#priority").value;
  if (
    name == "" ||
    desc == "" ||
    startDate == "" ||
    endDate == "" ||
    priority == ""
  ) {
    alert("Please Enter Values in Empty Fields");
  } else {
    let dataObj = { name, desc, startDate, endDate, priority };
    dataArr.push(dataObj);
    localStorage.setItem("task-list", JSON.stringify(dataArr));
  }
}
