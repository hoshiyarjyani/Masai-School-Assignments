// All the JS Code for the Add Students Page Goes Here


document.querySelector("form").addEventListener("submit",addDetails);
var detailArr = JSON.parse(localStorage.getItem("admission"))||  [];

function addDetails(event){
event.preventDefault();
var name = document.querySelector("#name").value;
var email = document.querySelector("#email").value;
var mobile = document.querySelector("#phone").value;
var gender = document.querySelector("#gender").value;
var course = document.querySelector("#course").value;
if(name == "" || email =="" || mobile == "" || gender == "" || course == ""){
    alert("Please Enter all detals")
}else{
    var detailObj = {"name":name,"email":email,"mobile":mobile,"gender":gender,"course":course};
    detailArr.push(detailObj);
    localStorage.setItem("admission",JSON.stringify(detailArr));
}

}
