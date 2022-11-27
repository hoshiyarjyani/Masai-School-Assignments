function twoStringsFromOne(N, str) {
  //write code here
  let vowel = "";
  let cons = "";
  for (let i = 0; i < N; i++) {
    if (
      str[i] == "a" ||
      str[i] == "e" ||
      str[i] == "i" ||
      str[i] == "o" ||
      str[i] == "u"
    ) {
      vowel += str[i];
    } else {
      cons += str[i];
    }
  }
  console.log(vowel);
  console.log(cons);
}

twoStringsFromOne(8, "hoshiyar");
twoStringsFromOne(6, "nrupul");