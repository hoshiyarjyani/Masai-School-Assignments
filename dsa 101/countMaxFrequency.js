// Sample Input 1
// 7
// 1 1 1 0 2 0 1

// Sample Output 1
// 1-4

function maxFrequency(N, arr) {
  //Write Code here
  let obj = {};
  for (let i = 0; i < N; i++) {
    if (obj[arr[i]] == undefined) {
      obj[arr[i]] = 1;
    } else {
      obj[arr[i]]++;
    }
  }
  let x = -Infinity;
  for (let key in obj) {
    if (x < obj[key]) {
      x = obj[key];
    }
  }
  for (let key in obj) {
    if (obj[key] == x) {
      console.log(key + "-" + obj[key]);
    }
  }
}
let arr = [1, 1, 1, 0, 2, 0, 1];
maxFrequency(7, arr);
