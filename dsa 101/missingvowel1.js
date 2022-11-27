function missingVowel(N, str) {
  //write code here
  let vowel = { a: 0, e: 0, i: 0, o: 0, u: 0 };

  let temp = "";

  for (let i = 0; i < N; i++) {
    if (vowel[str[i]] == 0) {
      vowel[str[i]]++;
    }
  }
  for (let key in vowel) {
    if (vowel[key] == 0) {
      temp += key;
    }
  }
  console.log(temp);
}

missingVowel(6, "nature");
