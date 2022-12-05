

let walletBalance = 5000;

let payAmt = document.getElementById("pay-amt");
let balanceAmt = document.getElementById("balance-amt");
let payButton = document.getElementById("pay-btn");
let feedbackText = document.getElementById("feedback-text");

// set the text content of balanceAmt to be the wallet balance.
function updateAmount() {
  balanceAmt.innerText = walletBalance + " ₹";
}
updateAmount();
// write a function called makePayment that returns a promise.
// promise resolves after 2 seconds if the payAmount is >= balanceAmt
// promise rejects after 2 seconds if the payAmount is < balanceAmt
// the makePayment function should take in amt which is used
// to decide if the payment passes or fails.

function makePayment(amount) {
  return new Promise((res, rej) => {
    setTimeout(() => {
      if (amount <= walletBalance) {
        res("Payment is Done");
      } else {
        rej("Balance is Not Enough");
      }
    }, 2000);
  });
}

// On click of payButton invoke makePayment()
payButton.addEventListener("click", function () {
  feedbackText.innerText = "Processing...";
  let amount = payAmt.value;
  makePayment(amount)
    .then((message) => {
      walletBalance = walletBalance - amount;
      updateAmount(walletBalance);
      feedbackText.innerText = message;
      payAmt.value = "";
    })
    .catch((err) => {
      alert(err);
      feedbackText.innerText = err;
    });
});
// in case the returned promise resolves, the feedback text & walletBalance is updated.
// in case the returned promise rejects, the feedback text is updated.
