var userDetails = JSON.parse(localStorage.getItem("userData")) || [];

document.querySelector("#signup").addEventListener("click", signUp);

function signUp() {
  var mobile = document.querySelector("#mobile").value;
  if (mobile == "") {
    alert("PLEASE ENTER VALID MOBILE NUMBER FOR SIGNUP");
  } else {
    let obj = {mobile: mobile};
    userDetails.push(obj);

    localStorage.setItem("userData", JSON.stringify(userDetails));
    alert("MOBILE NUMBER REGISTER SUCESSFULL");
  }
}

