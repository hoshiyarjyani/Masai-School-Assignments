function happyNumber(n) {
  //write code here
  let flag = false;
  let num = n.toString();

  for (let i = 0; i < 30; i++) {
    let sum = 0;
    for (let j = 0; j < num.length; j++) {
      sum += Number(num[j]) ** 2;
    }
    num = sum.toString();
    if (sum == 1) {
      flag = true;
      break;
    }
  }
  if (flag) {
    console.log("Yes");
  } else {
    console.log("No");
  }
}
happyNumber(19);
