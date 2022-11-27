function mapSymbolsSum(N, str) {
  //write code here
  let obj = { "!": 1, "@": 2, "#": 3, $: 4, "%": 5, "^": 6, "&": 7, "*": 8 };
  let sum = 0;
  for (let i = 0; i < N; i++) {
    for (let key in obj) {
      if (str[i] == key) {
        sum += obj[[key]];
      }
    }
  }
  console.log(sum);
}

mapSymbolsSum(4,"@%*%");