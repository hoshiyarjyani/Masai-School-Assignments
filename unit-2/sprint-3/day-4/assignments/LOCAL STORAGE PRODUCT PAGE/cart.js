let count = localStorage.getItem("countitem") || 0;
let cartarr = JSON.parse(localStorage.getItem("cart")) || [];
function displayItem(data){

let body = document.querySelector("body");
let parentDiv = document.createElement("div");
parentDiv.setAttribute("class", "parentDiv");

let cartdiv = document.createElement("div");
cartdiv.setAttribute("class","cart");
let cartchildname = document.createElement("div");
cartchildname.innerText= "CartItem - "
let cartchildvalue = document.createElement("div");
cartchildvalue.innerText=count;
cartchildname.setAttribute("class","cartchild");
cartchildvalue.setAttribute("class","cartchild"); 
body.append(cartdiv);
cartdiv.append(cartchildname,cartchildvalue);
parentDiv.setAttribute("class", "parentDiv");
body.append(parentDiv);

data.forEach(function (element, index) {
  let childDiv = document.createElement("div");
  childDiv.setAttribute("class", "childDiv");

  let img = document.createElement("img");
  img.src = element.image_url;

  let pName = document.createElement("p");
  pName.innerText = element.name;

  let price = document.createElement("p");
  price.innerText = "Price - " + element.price + " ₹";

  let sPrice = document.createElement("p");
  sPrice.innerText = "Strikedoffprice - " + element.strikedoffprice + " ₹";

  let btn = document.createElement("button");
  btn.innerText = "Remove Item";
  btn.addEventListener("click", function () {
    cartarr.splice(index,1);
    localStorage.setItem("cart", JSON.stringify(cartarr));
    count--;
    localStorage.setItem("countitem",count);
    cartchildvalue.innerText=count;
    body.innerHTML=null;
    displayItem(cartarr);
  });

  childDiv.append(img, pName, price, sPrice, btn);

  parentDiv.append(childDiv);
});
}

displayItem(cartarr);