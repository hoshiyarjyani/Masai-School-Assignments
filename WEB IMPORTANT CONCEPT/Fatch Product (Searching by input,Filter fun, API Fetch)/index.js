let url = "https://fakestoreapi.com/products";
var bag;
let cartArr = JSON.parse(localStorage.getItem("cartItem")) || [];
let x = fetch(url)
  .then((res) => res.json())
  .then((data) => {
    bag = data;
    displayData(data);
    console.log(data);
  });
function search() {
  let val = document.querySelector("#search").value;
  let newData = bag.filter(function (elem) {
    return elem.title.toLowerCase().includes(val.toLowerCase());
  });
  displayData(newData);
}

function handlesort() {
  let selected = document.querySelector("select").value;
  if (selected == "HTL") {
    bag.sort((a, b) => b.price - a.price);
    displayData(bag);
  } else {
    bag.sort((a, b) => a.price - b.price);
    displayData(bag);
  }
}

function displayData(data) {
  document.querySelector("#container").innerHTML = "";
  data.forEach((element) => {
    let div = document.createElement("div");

    let image = document.createElement("img");
    image.src = element.image;
    let title = document.createElement("h2");
    title.innerText = element.title;
    let desc = document.createElement("p");
    desc.innerText = element.description;
    let price = document.createElement("p");
    price.innerText = "Price - " + element.price;

    let rating = document.createElement("p");
    rating.innerText = "Rating - " + element.rating.rate;
    let btn = document.createElement("button");
    btn.innerText = "Add To Cart";
    btn.addEventListener("click", function () {
      let cartobj = { element };
      cartArr.push(cartobj);
      localStorage.setItem("cartItem", JSON.stringify(cartArr));
    });
    div.append(image, title, desc, price, rating, btn);
    document.querySelector("#container").append(div);
  });
}
