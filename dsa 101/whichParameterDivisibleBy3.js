function divisiblity(x) {
  if (x % 3 == 0) {
    return true;
  } else {
    return false;
  }
}

for (let i = 1; i <= 100; i++) {
  let ans = divisiblity(i);
   if (ans == true) {
    console.log(i, "Divisible By the 3");
  }
}

