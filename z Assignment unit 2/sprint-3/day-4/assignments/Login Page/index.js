var studentDetails = JSON.parse(localStorage.getItem("studentData")) || [];

document.querySelector("#signup").addEventListener("click", signUp);

function signUp() {
  var email = document.querySelector("#email").value;
  var mobile = document.querySelector("#mobile").value;
  var password = document.querySelector("#password").value;
  if (email == "" || mobile == "" || password == "") {
    alert("Please Enter All Details For SignUp");
  } else {
    let obj = { email: email, mobile: mobile, password: password };
    studentDetails.push(obj);

    localStorage.setItem("studentData", JSON.stringify(studentDetails));
    alert("Hurray...! Sign Up Sucessful");
  }
}

document.querySelector("#signIn").addEventListener("click", signIn);

function signIn() {
  var email1 = document.querySelector("#email").value;
  var mobile1 = document.querySelector("#mobile").value;
  var password1 = document.querySelector("#password").value;
  if (email1 == "" || mobile1 == "" || password1 == "") {
    alert("Please Enter All Details For SignIn");
  } else {
    let flag = false;
    studentDetails.forEach(function (elem, i) {
      if (
        email1 == elem.email &&
        mobile1 == elem.mobile &&
        password1 == elem.password
      ) {
        flag = true;
      }
    });
    if (flag) {
      alert("Login Sucessfull");
    } else {
      alert("oops! User Does Not Exist ! Try Again");
    }
  }
}
