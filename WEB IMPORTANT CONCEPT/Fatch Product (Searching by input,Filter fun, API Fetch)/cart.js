var cartArr = JSON.parse(localStorage.getItem("cartItem"));

let totelcost = cartArr.reduce((acc, ele) => acc + ele.price, 0);
document.querySelector("#rs").innerText = totelcost;

function displayData(data) {
  data.forEach((element) => {
    var div = document.createElement("div");

    let image = document.createElement("img");
    image.src = element.element.image;

    let title = document.createElement("h2");
    title.innerText = element.element.title;

    let desc = document.createElement("p");
    desc.innerText = element.element.description;

    let price = document.createElement("p");
    price.innerText = "Price - " + element.element.price;

    let rating = document.createElement("p");
    rating.innerText = "Rating - " + element.element.rating.rate;

    div.append(image, title, desc, price, rating);

    document.querySelector("#container").append(div);
  });
}
displayData(cartArr);
console.log(cartArr);
