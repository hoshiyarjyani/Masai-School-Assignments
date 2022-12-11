// Take out the form-input button using DOM.
const Register_btn = document.querySelector("#register form");
Register_btn.addEventListener("submit",RegisterFunction);

// Make API request to server for registering the new user.
async function RegisterFunction(event) {
  try {
    event.preventDefault();
    let all_input_tags = document.querySelectorAll("#register input");
    let userObj = {};
    for (let i = 0; i < all_input_tags.length - 1; i++) {
      userObj[all_input_tags[i].id] = all_input_tags[i].value;
    }
    let register_request = await fetch("http://localhost:9090/user/register", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(userObj)
    });
    if(register_request.ok){
        alert("Hurry, User has been created !!");
        window.location.href = "#tologin";
    }else{
        alert("Bad request has been made.");
    }
  } catch (error) {
    alert("Something went wrong. Please try again later.");
  }
}
//  Add eventListner to Login Button.
const Login_btn = document.querySelector("#login form");
Login_btn.addEventListener("submit",LoginFunction);

async function LoginFunction(event){
    try {
        event.preventDefault();
        let all_login_input = document.querySelectorAll("#login input");
        let obj = {};
        for(let i=0;i<all_login_input.length-1;i++){
            obj[all_login_input[i].id] = all_login_input[i].value;
        }
        console.log(obj);
        let login_request = await fetch("http://localhost:9090/user/login",{
            method : "POST",
            body : JSON.stringify(obj),
            headers : {
                "Content-Type" : "application/json"
            },
        })
        if(login_request.ok){
            let token = await login_request.json();
            sessionStorage.setItem("access_token", token.accessToken);
            alert("User has been successfully Logged In.");
            window.location.href = "todo.html";
        }else{
            alert("User not found.");
        }
    } catch (error) {
		console.log(error);
        alert("wrong username or password. Please try again later.");
    }
}
