function twoStringsFromOne(N, str) {
  //write code here
  let strA = [];
  for (let i = 0; i < N; i++) {
    strA.push(str[i]);
  }

  let vowel = "";

  let arr = ["a", "e", "i", "o", "u"];
  for (let i = 0; i < N; i++) {
    for (let j = 0; j < 5; j++) {
      if (strA[i] == arr[j]) {
        vowel += strA[i];
        delete strA[i];
      }
    }
  }
  console.log(vowel);
  let cons = "";
  for (let i = 0; i < strA.length; i++) {
    if (strA[i] !== undefined) {
      cons += strA[i];
    }
  }
  console.log(cons);
}

twoStringsFromOne(8, "hoshiyar");
