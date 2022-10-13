function merging(N, arr1, arr2) {
  let temp = "";

  let arr = [];
  for (let i = 0; i < N; i++) {
    arr.push(arr1[i]);
    arr.push(arr2[i]);
  }

  let newarr = arr.sort();

  for (let i = 0; i < newarr.length; i++) {
    temp += newarr[i] + " ";
  }
  console.log(temp.trim());
}
merging(3, [10, 20, 30], [5, 15, 25]);
