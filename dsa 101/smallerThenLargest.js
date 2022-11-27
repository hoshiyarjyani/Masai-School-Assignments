function smallerThanLargest(N, A) {
  // write code here
  let largest = -Infinity;

  for (let i = 0; i < N; i++) {
    if (A[i] > largest) {
      largest = A[i];
    }
  }
  let beg = "";
  for (let i = 0; i < N; i++) {
    if (A[i] == largest) {
      beg += largest + " ";
    } else {
      beg += "-1" + " ";
    }
  }
  console.log(beg.trim());
}

smallerThanLargest(5, [3, 3, 2, 1, 1]);
