var city;
var storedata;

// annomius Function by button pressing

document.querySelector("button").addEventListener("click", function () {
  city = document.querySelector("#input").value;

  // weather url

  var url =
    "https://api.openweathermap.org/data/2.5/weather?q=" +
    city +
    "&units=metric&lang=hi&appid=d7deec0a77b8170d9cb82bbd7d05f7a7";

  // weather data featching
  fetch(url)
    .then((res) => res.json())
    .then((data) => {
      storedata = data;
      console.log(data);
      displayData(data);

      // map url of particular city
      let map = document.querySelector("#gmap_canvas");
      map.src =
        "https://maps.google.com/maps?q=" +
        city +
        "&t=&z=13&ie=UTF8&iwloc=&output=embed";
    })
    .catch((err) => alert("CITY NOT FOUND...TRY AGAIN"));

  start();

  //5day api here start

  var fiveday =
    "https://api.openweathermap.org/data/2.5/forecast?q=" +
    city +
    "&lang=hi&units=metric&appid=32ba0bfed592484379e51106cef3f204";

  fetch(fiveday)
    .then((reso) => reso.json())
    .then((datas) => {
      forcastDatashow(datas);
      console.log(datas);
    })
    .catch((err) => alert(err + " forcast wali error aagyi"));
  console.log(five);

  //5day api close here
});
// for time and wether update after one sec.

function start() {
  setInterval(dateFun, 1000);
}


function dateFun() {
  displayData(storedata);
}

//display data function

function displayData(data) {
  document.querySelector("#weather").innerHTML = "";

  var Wdiv = document.querySelector("#weather");

  var name = document.createElement("h2");
  name.innerText = city.toUpperCase() + "  " + data.name;

  var date = document.createElement("p");
  date.innerText = "( " + new Date() + " )";

  var lat = document.createElement("p");
  lat.innerText = "Latitude -  " + data.coord.lat;

  var lon = document.createElement("p");
  lon.innerText = "Longitude -  " + data.coord.lon;

  var icon = "http://openweathermap.org/img/w/" + data.weather[0].icon + ".png";
  var image = document.createElement("img");
  image.src = icon;

  var temper = document.createElement("h1");
  temper.innerText = "Temp -  " + data.main.temp + " C";
  var feel = document.createElement("h4");
  feel.innerText = "Temp Feel Like -  " + data.main.feels_like + " C";

  var max = document.createElement("p");
  max.innerText = "Today's Max Temp. -  " + data.main.temp_max + " C";

  var min = document.createElement("p");
  min.innerText = "Today's Min Temp. -  " + data.main.temp_min + " C";

  var humi = document.createElement("p");
  humi.innerText = "Humidity -  " + data.main.humidity;

  var wind = document.createElement("p");
  wind.innerText = "Wind Speed -  " + data.wind.speed * 1.61 + " km/h";

  var cloud = document.createElement("h4");
  cloud.innerText = "Cloud -  " + data.weather[0].description;

  var press = document.createElement("p");
  press.innerText = "Pressure -  " + data.main.pressure + " mbar";

  var sea = document.createElement("p");
  sea.innerText = "Sea Level -  " + data.main.sea_level + " mtr";
  if (data.main.sea_level == undefined) {
    sea.innerText = "Sea Level -  " + 1200 + " mtr";
  }
  let sr = data.sys.sunrise;
  let x = new Date(sr * 1000).toLocaleTimeString();
  var sunrise = document.createElement("h5");
  sunrise.innerText = "Sunrise Time -  " + x;

  let ss = data.sys.sunset;
  let w = new Date(ss * 1000).toLocaleTimeString();
  var sunset = document.createElement("h5");
  sunset.innerText = "Sunset Time -  " + w;

  Wdiv.append(
    name,
    date,
    lat,
    lon,
    image,
    cloud,
    temper,
    feel,
    max,
    min,
    humi,
    wind,
    press,
    sea,
    sunrise,
    sunset
  );
}

////////////////////////////forcast weather ///////////////////////////

function forcastDatashow(datas) {
  let forcastdiv = document.querySelector("#forcast");
  forcastdiv.innerHTML = "";
  for (let i = 0; i < datas.list.length; i++) {
    // document.querySelector("#forcast").innerHTML = "";

    var Fdiv = document.createElement("div");

    var Fname = document.createElement("h5");
    Fname.innerText = datas.city.name;

    var Udate = document.createElement("h5");
    Udate.innerText = "( " + datas.list[i].dt_txt + " )";

    var Ficon =
      "http://openweathermap.org/img/w/" +
      datas.list[i].weather[0].icon +
      ".png";
    var Fimage = document.createElement("img");
    Fimage.src = Ficon;

    var Ftemper = document.createElement("h4");
    Ftemper.innerText = "Temp -  " + datas.list[i].main.temp + " C";

    var Ffeel = document.createElement("h5");
    Ffeel.innerText =
      "Temp Feel Like -  " + datas.list[i].main.feels_like + " C";

    var Fmax = document.createElement("h5");
    Fmax.innerText = "Max Temp. -  " + datas.list[i].main.temp_max + " C";

    var Fmin = document.createElement("h5");
    Fmin.innerText = "Min Temp. -  " + datas.list[i].main.temp_min + " C";

    var Fhumi = document.createElement("h5");
    Fhumi.innerText = "Humidity -  " + datas.list[i].main.humidity;

    var Fcloud = document.createElement("h5");
    Fcloud.innerText = "Cloud -  " + datas.list[i].weather[0].description;

    var Fpress = document.createElement("h5");
    Fpress.innerText = "Pressure -  " + datas.list[i].main.pressure + " mbar";

    let srf = datas.city.sunrise;
    let c = new Date(srf * 1000).toLocaleTimeString();
    var Fsunrise = document.createElement("h5");
    Fsunrise.innerText = "Sunrise Time -  " + c;

    let ssf = datas.city.sunset;
    let d = new Date(ssf * 1000).toLocaleTimeString();
    var Fsunset = document.createElement("h5");
    Fsunset.innerText = "Sunset Time -  " + d;

    Fdiv.append(
      Fname,
      Udate,
      Fimage,
      Ftemper,
      Ffeel,
      Fmax,
      Fmin,
      Fhumi,
      Fcloud,
      Fpress,
      Fsunrise,
      Fsunset
    );
    forcastdiv.append(Fdiv);
  }
}

//on load

function Defaultvalue() {
  document.querySelector("#input").value = "New Delhi";

  city = document.querySelector("#input").value;

  // weather url

  var url =
    "https://api.openweathermap.org/data/2.5/weather?q=" +
    city +
    "&units=metric&lang=hi&appid=d7deec0a77b8170d9cb82bbd7d05f7a7";

  // weather data featching
  fetch(url)
    .then((res) => res.json())
    .then((data) => {
      storedata = data;
      console.log(data);
      displayData(data);

      // map url of particular city
      let map = document.querySelector("#gmap_canvas");
      map.src =
        "https://maps.google.com/maps?q=" +
        city +
        "&t=&z=13&ie=UTF8&iwloc=&output=embed";
    })
    .catch((err) => alert("CITY NOT FOUND...TRY AGAIN"));

  start();

  //5day api here start

  var fiveday =
    "https://api.openweathermap.org/data/2.5/forecast?q=" +
    city +
    "&lang=hi&units=metric&appid=32ba0bfed592484379e51106cef3f204";

  fetch(fiveday)
    .then((reso) => reso.json())
    .then((datas) => {
      forcastDatashow(datas);
      console.log(datas);
    })
    .catch((err) => alert(err + " forcast wali error aagyi"));
  console.log(five);

  //5day api close here
}
