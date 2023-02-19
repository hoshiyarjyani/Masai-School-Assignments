class Pair {
    int wins;
    String name;

    Pair(int wins, String name) {
        this.wins = wins;
        this.name = name;
    }

    // write the constructor as mentioned in the problem statement
}

class footballWorldCup {
    int n = 32;
    Pair[] arr;

    footballWorldCup(Pair[] arr) {
        this.arr = arr;
    }

    String[] topSixteen() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].wins < arr[j].wins) {
                    Pair temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                if (arr[i].wins == arr[j].wins) {
                    if (arr[i].name.compareTo(arr[j].name) > 0) {
                        Pair temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        String[] ans = new String[16];
        for (int i = 0; i < 16; i++) {
            ans[i] = arr[i].name;
        }
        return ans;
    }

    String[] topEight() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].wins < arr[j].wins) {
                    Pair temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                if (arr[i].wins == arr[j].wins) {
                    if (arr[i].name.compareTo(arr[j].name) > 0) {
                        Pair temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        String[] ans = new String[8];
        for (int i = 0; i < 8; i++) {
            ans[i] = arr[i].name;
        }
        return ans;
    }

    String[] topFour() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].wins < arr[j].wins) {
                    Pair temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                if (arr[i].wins == arr[j].wins) {
                    if (arr[i].name.compareTo(arr[j].name) > 0) {
                        Pair temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        String[] ans = new String[4];
        for (int i = 0; i < 4; i++) {
            ans[i] = arr[i].name;
        }
        return ans;
    }

    String[] topTwo() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].wins < arr[j].wins) {
                    Pair temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                if (arr[i].wins == arr[j].wins) {
                    if (arr[i].name.compareTo(arr[j].name) > 0) {
                        Pair temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        String[] ans = new String[2];
        for (int i = 0; i < 2; i++) {
            ans[i] = arr[i].name;
        }
        return ans;
    }

    String winner() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].wins < arr[j].wins) {
                    Pair temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[0].name;
    }
}