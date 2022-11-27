function pallindrome(N, S) {
  // Write your code here!
  let mid = Math.floor(N / 2);
  let count = 0;
  for (let i = 0; i < mid; i++) {
    if (S[i] == S[N - i - 1]) {
      count++;
    }
  }
  if (N == 1) {
    console.log("Possible!");
  } else if (N == 2) {
    if (S[0] == S[1]) {
      console.log("Possible!");
    } else {
      console.log("Not Possible!");
    }
  } else if (count == mid) {
    console.log("Possible!");
  } else {
    console.log("Not Possible!");
  }
}
let str = "racecar";
pallindrome(7,str,);
