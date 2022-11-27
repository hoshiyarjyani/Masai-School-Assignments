function missingInteger(arr) {
  //Code Here
  let A = [];
  for (let i = 0; i <= arr.length; i++) {
    A.push(i + 1);
  }
  let newArr = A.concat(arr);

  let obj = {};
  for (let i = 0; i < newArr.length; i++) {
    if (obj[newArr[i]] == undefined) {
      obj[newArr[i]] = 1;
    } else {
      obj[newArr[i]]++;
    }
  }
  for (let key in obj) {
    if (obj[key] == 1) {
      console.log(key);
    }
  }
}

let arr = [4, 5, 1, 3];
missingInteger(arr);
