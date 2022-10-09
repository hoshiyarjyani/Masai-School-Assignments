function flowerManagement(N, K, flowerbed) {
  // write code here

  let count = 0;
  if (flowerbed[0] == 0 && flowerbed[1] == 0) {
    flowerbed[0] = 1;
    count++;
  }
  for (let i = 1; i < N - 1; i++) {
    if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
      flowerbed[i] = 1;
      count++;
    }
  }
  if (flowerbed[N - 1] == 0 && flowerbed[N - 2] == 0) {
    flowerbed[N - 1] = 1;
    count++;
  }
  if (count == K) {
    console.log("Yes");
  } else {
    console.log("No");
  }
}
