let count = localStorage.getItem("countitem") || 0;
let cartarr = JSON.parse(localStorage.getItem("cart")) || [];
let p =1;
function calculate(data){
let sum = 0;

for (let i = 0; i < data.length; i++) {
  sum += +data[i].price;
  Math.floor(sum);
}

let offerbtn = document.querySelector("#promobtn");
offerbtn.addEventListener("click", discount);

let offercode = document.querySelector("#promo");
p =1;
function discount(event){
  event.preventDefault();
  if(offercode.value=="masai30" && p==1){
    sum*=0.70;
    alert("Hurray...! You Get 30% Discount");
    p++;
  }else{
    sum=sum*1;
  }
  totel.innerText="Totel Amount = "+ sum + " ₹";
}

let totel = document.querySelector("#totel");
totel.innerText="Totel Amount = "+ sum +" ₹";
}

function displayItem(data) {

  let body = document.querySelector("body");
  let parentDiv = document.createElement("div");
  parentDiv.setAttribute("class", "parentDiv");

  let cartdiv = document.createElement("div");
  cartdiv.setAttribute("class", "cart");
  let cartchildname = document.createElement("div");
  cartchildname.innerText = "Cart Item - ";
  let cartchildvalue = document.createElement("div");
  cartchildvalue.innerText = count;
  cartchildname.setAttribute("class", "cartchild");
  cartchildvalue.setAttribute("class", "cartchild");
  body.append(cartdiv);
  cartdiv.append(cartchildname, cartchildvalue);
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
      cartarr.splice(index, 1);
      localStorage.setItem("cart", JSON.stringify(cartarr));
      count--;
      localStorage.setItem("countitem", count);
      cartchildvalue.innerText = count;
      body.innerHTML = null;
      displayItem(cartarr);
      calculate(cartarr);
    });

    childDiv.append(img, pName, price, sPrice, btn);

    parentDiv.append(childDiv);
  });
}

displayItem(cartarr);
calculate(cartarr);
