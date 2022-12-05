let queueDiv = document.getElementById("queue-div");
let registerBtn = document.getElementById("register-btn");
let startVaccination = document.getElementById("start-vaccination-btn");

// init
let queue = ["swanand", "maya", "bob", "ronaldo"];
reRenderQueue();
registerBtn.addEventListener("click", register);
startVaccination.addEventListener("click", start);

// functions
function reRenderQueue() {
  queueDiv.innerHTML = `
    <code><pre>${JSON.stringify(queue, null, 2)}</pre></code>
  `;
}

function register() {
  let name = document.getElementById("name").value;
  queue.push(name);

  let message = `${name} your registration is succesfull. Please wait for your turn.`;
  console.log(message);

  reRenderQueue();
}

// every 2 seconds,
// the first one on the que must be called: `swanand, it's your turn.`
// the above message should be logged to the console.
// the first item should be removed form the queue &
// it should reflect in the UI
// when everyone is done, the log must be "All done! 🎉"
// optionally: change the rendered logic to render an ordered list
function start() {
  let stop = setInterval(() => {
    let person = queue.shift();
    if (person === undefined) {
      clearInterval(stop);
      console.log("All Done");
    } else {
      console.log(person);
      reRenderQueue();
    }
  }, 2000);
}
