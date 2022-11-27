// subString of any word/number.

function subStrings(str) {
  let longest = 0;
  for (let i = 0; i < str.length; i++) {
    var beg = "";
    for (let j = i; j < str.length; j++) {
      beg += str[j];
      let rev = "";
      for (let k = beg.length - 1; k >= 0; k--) {
        rev += beg[k];
      }
      if (beg == rev && beg.length > longest) {
        longest = beg.length;
      }
    }
  }
  console.log(longest);
}

let str = "thisracecarisgood";
subStrings(str);
