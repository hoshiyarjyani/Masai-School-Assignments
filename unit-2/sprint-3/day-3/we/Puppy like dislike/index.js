// for like part

document.querySelector("#like").addEventListener("click", likedog);
var likecount = JSON.parse(localStorage.getItem("like")) || 0;
Displaylike();
function likedog() {
  likecount++;
  localStorage.setItem("like", JSON.stringify(likecount));
  Displaylike();
}

function Displaylike() {
  document.querySelector("#lc").innerHTML = likecount;
}

// for Dislike part

document.querySelector("#dislike").addEventListener("click", dislikedog);
var dislikecount = JSON.parse(localStorage.getItem("dislike")) || 0;
Displaydislike();
function dislikedog() {
  dislikecount--;
  localStorage.setItem("dislike", JSON.stringify(dislikecount));
  Displaydislike();
}

function Displaydislike() {
  document.querySelector("#dc").innerHTML = dislikecount;
}
