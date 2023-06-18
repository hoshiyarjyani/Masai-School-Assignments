document.querySelector("#storename").addEventListener("click", storename);
function storename() {
  localStorage.setItem("username", "Masai School");
}

document.querySelector("#getname").addEventListener("click", getname);
function getname() {
  let username = localStorage.getItem("username");
  document.querySelector("h1").innerText = username;
}

document.querySelector("#storemobile").addEventListener("click", storemobile);
function storemobile() {
  localStorage.setItem("mobile", "999999999");
}

document.querySelector("#getmobile").addEventListener("click", getmobile);
function getmobile() {
  let mobile = localStorage.getItem("mobile");
  document.querySelector("h1").innerText = mobile;
}
let hobbies = ["cricket", "music"];
document.querySelector("#storehobby").addEventListener("click", storehobby);
function storehobby() {
  localStorage.setItem("my_hobbies", JSON.stringify(hobbies));
}

document.querySelector("#gethobby").addEventListener("click", gethobby);
function gethobby() {
  let hobby = JSON.parse(localStorage.getItem("my_hobbies"));
  document.querySelector("h1").innerText = hobby;
  console.log(hobby);
}

let students = [
  { name: "Nrupul", place: "Banglore" },
  { name: "Prateek", place: "Mumbai" },
];
document.querySelector("#storedata").addEventListener("click", storedata);
function storedata() {
  localStorage.setItem("students", JSON.stringify(students));
}

document.querySelector("#getdata").addEventListener("click", getdata);
function getdata() {
  var data = JSON.parse(localStorage.getItem("students"));
  data.forEach(function (element) {
    console.log(element.name, element.place);
  });
}
