alert("Please Enter Otp for proceed the Payment");
let otp = document.querySelector("#otp");

let btn = document.querySelector("#validate");
btn.addEventListener("click", validate);

function validate() {
  if (otp.value == "123456") {
    alert("Hurray!...payment Successful");
  } else {
    alert("wrong OTP");
  }
}
