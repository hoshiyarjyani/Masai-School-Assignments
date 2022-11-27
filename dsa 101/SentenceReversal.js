function masaiSentenceReverse(s) {
  //write code here
  let arr = [];
  let temp = "";
  arr = s.split(" ");

  for (let i = arr.length - 1; i >= 0; i--) {
    temp += arr[i] + " ";
  }
  console.log(temp.trim());
}
masaiSentenceReverse("A Transformation in education");
