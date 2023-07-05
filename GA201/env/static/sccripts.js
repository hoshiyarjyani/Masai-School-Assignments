 
function validateForm() {
    // Example form validation function
    var status = document.getElementById("status").value;
    
    if (status === "") {
      alert("Please select a status.");
      return false;
    }
    
    return true;
  }
  