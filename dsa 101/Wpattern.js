function patternW(N) {
  // Write code here
  for (let i = 0; i < N; i++) {
    let beg = "";
    for (let j = 0; j < 4 * N; j++) {
      if (j == i || j == 2 * N + i) {
        beg += "\\";
      } else if (j == 2 * N - 1 - i) {
        beg += "/";
      } else if (j == 4 * N - 1 - i) {
        beg += "/";
        break;
      } else {
        beg += " ";
      }
    }
    console.log(beg);
  }
}
patternW(4);
