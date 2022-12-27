function duplicateRemove(str) {
  let result = "";
  if (str.length == 0) {
    console.log("Empty String");
    return;
  }
  if (str.length == 1) {
    return str;
  }

  for (let i = 0; i < str.length; i++) {
    if (i == 0 && str.charAt(i) != str.charAt(i + 1)) {
      result += str.charAt(i);
    } else if (i == str.length - 1 && str.charAt(i - 1) != str.charAt(i)) {
      result += str.charAt(i);
    } else {
      if (
        str.charAt(i) != str.charAt(i - 1) &&
        str.charAt(i) != str.charAt(i + 1)
      ) {
        result += str.charAt(i);
      }
    }
  }

  if (str.length == result.length) {
    console.log(result);
    return result;
  } else {
    duplicateRemove(result);
  }
}

let str = "raceecar";
duplicateRemove(str);
let str1 = "Hoshiyaayr";
duplicateRemove(str1);
