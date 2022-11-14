var userDetails = JSON.parse(localStorage.getItem("userData")) || [];

document.querySelector("#signup").addEventListener("click",function(){
  var fname = document.querySelector("#name").value;
  var lname = document.querySelector("#lastname").value;
  var email = document.querySelector("#email").value;
  var mobile = document.querySelector("#mobile").value;
  var password = document.querySelector("#password").value;
  if (fname=="" || lname==""|| email == "" || mobile == "" || password == "") {
    alert("Please Enter All Details For SignUp");
  } else {
    let obj = {fname:fname,lname:lname, email: email, mobile: mobile, password: password };
    userDetails.push(obj);

    localStorage.setItem("userData", JSON.stringify(userDetails));
    alert("Hurray...! Sign Up Sucessful Please LOGIN for Shopping");
    window.location.href = "/login.html";
  }

});
