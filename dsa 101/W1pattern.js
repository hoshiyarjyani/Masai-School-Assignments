function patternW(N) {
  for (i = 0; i < N; i++) {
    let sum = "";
    for (j = 0; j < 4 * N; j++) {
      if (j == i || j + i == 2 * N + 2 * i) {
        sum += "\\";
      } else if (j + i == 2 * N - 1) {
        sum += "/";
      } else if (j + i == 4 * N - 1) {
        sum += "/";
        break;
      } else {
        sum += " ";
      }
    }
    console.log(sum);
  }
}
patternW(4);