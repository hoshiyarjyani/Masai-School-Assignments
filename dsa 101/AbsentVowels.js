function missingVowel(n, str) {
  let arr = ["a", "e", "i", "o", "u"];
  let presentVowel = "";

  //find the present vowels
  for (let i = 0; i < arr.length; i++) {
    for (let j = 0; j < n; j++) {
      if (arr[i] == str[j]) {
        presentVowel += str[j];
        break;
      }
    }
  }
  console.log("presentVowel:= " + presentVowel);

  if (presentVowel == "") {
    console.log("aeiou");
    return;
  }
  //find absent vowels
  //arr= aeiou
  //prs= aei
  let vowelAbsent = "";
  for (let i = 0; i < arr.length; i++) {
    for (let j = 0; j < presentVowel.length; j++) {
      if (arr[i] == presentVowel[j]) {
        break;
      } else if (presentVowel.length - 1 == j) {
        vowelAbsent += arr[i];
      }
    }
  }
  console.log(vowelAbsent);
  if (vowelAbsent == "") {
    console.log("-1");
  } else {
    console.log(vowelAbsent);
  }
}

missingVowel(7, "701 213");
