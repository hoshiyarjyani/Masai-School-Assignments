function Checkprime(num) {
    let count = 0;
    for (let i = 1; i <= num; i++) {
      if (num % i == 0) {
        count++;
      }
    }
    if (count == 2) {
      console.log(num, "is prime");
    } else {
      console.log(num, "is not prime");
    }
  }
  for (let j = 1; j < 20; j++) {
    Checkprime(j);
  }