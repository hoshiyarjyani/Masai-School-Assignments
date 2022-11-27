function distinctDigits(l, r) {
  //write your code over here
  let arr = [];
  for (let i = l; i <= r; i++) {
    arr.push(i);
  }
  let isMin = false;
  let minimum = Infinity;
  for (let i = 0; i < arr.length; i++) {
    var str = arr[i].toString();
    for (let j = 0; j < 1; j++) {
      if (
        (str.length == 3 &&
          str[j] != str[j + 1] &&
          str[j + 1] != str[j + 2] &&
          str[j] != str[j + 2]) ||
        (str.length == 2 && str[j] != str[j + 1]) ||
        str.length == 1
      ) {
        if (minimum > arr[i]) {
          minimum = arr[i];
          isMin = true;
        }
      }
    }
  }
  if (isMin) {
    console.log(minimum);
  } else {
    console.log(-1);
  }
}
distinctDigits(121, 122);
