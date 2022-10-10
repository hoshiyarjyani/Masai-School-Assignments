function ACM_ICPC_India_Rank(N, countriesArr) {
  //write code here
  let ind = 0;
  for (let i = 0; i < N; i++) {
    if (countriesArr[i] == "India") {
      ind = i + 1;
    }
  }
  console.log(ind);
}
ACM_ICPC_India_Rank(5, ["Russia", "USA", "Japan", "China", "India"]);
