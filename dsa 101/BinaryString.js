// problem - Find the totel no. of zero in subString.
function binaryString(N, str) {
  //write code here
  let count = 0;
  let lastMax = 0;
  for (let i = 0; i < N; i++) {
    for (let j = i; j < N; j++) {
      if (str[i] == 0 && str[j] == 0) {
        count++;
      } else {
        break;
      }
    }
    if (lastMax < count) {
      lastMax = count;
      count = 0;
    }
  }
  console.log(lastMax);
}

binaryString(8, "10010001");
