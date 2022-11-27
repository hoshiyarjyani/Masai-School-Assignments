function vowelAndConsonantCount(N, str) {
  //write code here
  let vowel = ["a", "e", "i", "o", "u"];
  let vcount = 0;
  let cCount = 0;

  for (let i = 0; i < 5; i++) {
    for (let j = 0; j < N; j++) {
      if (vowel[i] == str[j]) {
        vcount++;
      }
    }
  }
  cCount = N - vcount;
  console.log(vcount, cCount);
}
vowelAndConsonantCount(6,"ankus");