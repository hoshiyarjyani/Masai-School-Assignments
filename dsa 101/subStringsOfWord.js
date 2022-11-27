// subString of any word/number.

function subStrings(str) {
  for (let i = 0; i < str.length; i++) {
    let beg = "";
    for (let j = i; j < str.length; j++) {
      beg += str[j];
      console.log(beg);
    }
  }
}

let str = "abcab";
subStrings(str);

let str1 = "12345";
subStrings(str1);
