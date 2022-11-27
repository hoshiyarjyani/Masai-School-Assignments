function skyLines(arr, N) {
  //write your code over here
  let beg = "";
  for (let i = 0; i < N; i++) {
    if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
      beg += "2" + " ";
    } else if (arr[i - 1] > arr[i] && arr[i] < arr[i + 1]) {
      beg += "0" + " ";
    } else if (arr[i - 1] < arr[i] && arr[i] < arr[i + 1]) {
      beg += "1" + " ";
    } else if (arr[i - 1] > arr[i] && arr[i] > arr[i + 1]) {
      beg += "1" + " ";
    } else if (arr[i] > arr[i + 1]) {
      beg += "1" + " ";
    } else if (arr[i] < arr[i + 1]) {
      beg += "0" + " ";
    } else if (arr[i - 1] < arr[i]) {
      beg += "1" + " ";
    } else if (arr[i - 1] > arr[i]) {
      beg += "0" + " ";
    } else {
      beg += "0" + " ";
    }
  }
  console.log(beg);
}
let arr = [1, 4, 3, 2, 7];

skyLines(arr, 5);
