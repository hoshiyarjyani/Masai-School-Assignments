
var city;
var storedata;

// annomius Function by button pressing

document.querySelector("#ms").addEventListener("click", function () {
  local = document.querySelector("#cityname").value;

      // map url of particular city
      let map = document.querySelector("#gmap_canvas");
      map.src =
        "https://maps.google.com/maps?q="+local+"&t=&z=13&ie=UTF8&iwloc=&output=embed";
    });
