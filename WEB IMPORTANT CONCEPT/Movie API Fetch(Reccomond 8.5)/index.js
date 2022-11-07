var val;
var url = null;

let btn = document.querySelector("button");
btn.addEventListener("click", function () {
  val = document.querySelector("#search").value;
  url = "http://www.omdbapi.com/?i=tt3896198&apikey=3614d837&t=" + val;
  fetch(url)
    .then((res) => res.json())
    .then((data) => {
      displayData(data);
      console.log(data);
    })
    .catch(() => {
      alert("Movie Not Found");
    });
});

function displayData(data) {
  if (data.Title == undefined || val == "") {
    document.querySelector("#container").innerHTML = "";
    alert("Movie not found");
  } else {
    var recomImg = document.createElement("img");
    recomImg.src = "";
    if (
      data.Ratings[0].Value == "8.6/10" ||
      data.Ratings[0].Value == "8.7/10" ||
      data.Ratings[0].Value == "8.8/10" ||
      data.Ratings[0].Value == "8.9/10" ||
      data.Ratings[0].Value == "9.0/10" ||
      data.Ratings[0].Value == "9.1/10" ||
      data.Ratings[0].Value == "9.2/10" ||
      data.Ratings[0].Value == "9.3/10" ||
      data.Ratings[0].Value == "9.4/10" ||
      data.Ratings[0].Value == "9.5/10" ||
      data.Ratings[0].Value == "9.6/10" ||
      data.Ratings[0].Value == "9.7/10" ||
      data.Ratings[0].Value == "9.8/10" ||
      data.Ratings[0].Value == "9.9/10" ||
      data.Ratings[0].Value == "10/10"
    ) {
      recomImg.src =
        "https://c8.alamy.com/comp/2AT4YG8/recommendation-sign-recommendation-round-ribbon-sticker-recommendation-tag-2AT4YG8.jpg";
    }

    document.querySelector("#container").innerHTML = "";

    let div = document.createElement("div");

    let image = document.createElement("img");
    image.src = data.Poster;
    let title = document.createElement("h2");
    title.innerText = data.Title;
    let desc = document.createElement("p");
    desc.innerText = data.Country;
    let price = document.createElement("p");
    price.innerText = "Earning - " + data.BoxOffice;

    let rating = document.createElement("p");
    rating.innerText = "Rating- " + data.Ratings[0].Value;

    let relase = document.createElement("p");
    relase.innerText = "Released - " + data.Released;
    div.append(image, title, desc, price, relase, rating, recomImg);
    document.querySelector("#container").append(div);
  }
}
