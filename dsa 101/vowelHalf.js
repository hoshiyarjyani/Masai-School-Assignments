function vowelHalf(N, str) {
  //write code here
  let vowel = ["a", "e", "i", "o", "u"];
  let count = 0;
  for (let i = 0; i < N; i++) {
    for (let j = 0; j < 5; j++) {
      if (str[i] == vowel[j]) {
        count++;
      }
    }
  }
  if (count > N / 2) {
    console.log("True");
  } else {
    console.log("False");
  }
}

vowelHalf(6, "aabefe");
