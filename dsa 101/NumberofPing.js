function numberOfPing(N, S) {
  //write your code over here
  let obj = {};
  for (let i = 0; i < N; i++) {
    if (
      obj[S[i]] == undefined &&
      (S[i] == "p" || S[i] == "i" || S[i] == "n" || S[i] == "g")
    ) {
      obj[S[i]] = 1;
    } else if (obj[S[i]] != undefined) {
      obj[S[i]]++;
    }
  }

  let min = Infinity;
  for (let key in obj) {
    if (key == "p" || key == "i" || key == "n" || key == "g") {
      if (obj[key] < min) {
        min = obj[key];
      }
    }
  }
  let a = 0;
  for (let key in obj) {
    if (key == "p" || key == "i" || key == "n" || key == "g") {
      a++;
    }
  }
  if (min == Infinity) {
    console.log(0);
  } else if (a == 4) {
    console.log(min);
  } else {
    console.log(0);
  }
}
numberOfPing(7, "pingpin");
numberOfPing(8, "pingping");
