function maximumOccuringElement(A, N) {
  //set the array's element in obj.

  let element = 1;
  obj = {};
  for (let i = 0; i < N; i++) {
    if (obj[A[i]] == undefined) {
      obj[A[i]] = 1;
    } else {
      obj[A[i]]++;

      // update the value of an Element of Object.

      if (element < obj[A[i]]) {
        element = obj[A[i]];
      }
    }
  }

  // for loop for the check which element's key value equal to element.

  for (let key in obj) {
    if (obj[key] == element) {
      console.log(key);
    }
  }
}
// Function Calling

let A = [1, 2, 0, 7, 7, 7, 5, 0, 6];

maximumOccuringElement(A, 9);
