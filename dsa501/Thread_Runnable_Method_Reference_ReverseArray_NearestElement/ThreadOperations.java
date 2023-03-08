package jyani.hoshiyar.problem2;

public class ThreadOperations {

    public static void reverseArray() {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = 0; i < 5; i++) {
            int temp = arr[i];
            int k = arr[arr.length - 1 - i];
            System.out.println("Swapping " + temp + ", " + k);
            arr[i] = k;
            arr[arr.length - 1 - i] = temp;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(arr[i] + " ");
        }
        System.out.println(sb);
    }

    public void findNearestToAverage() {
        int avgArr[] = { 1, 2, 3, 4, 15, 6, 7, 10, 12, 20 };
        int avg = 0;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += avgArr[i];
        }
        avg = sum / 10;
        int nearElem = avgArr[0];
        for (int i = 0; i < 10; i++) {
            if (Math.abs(avg - avgArr[i]) < Math.abs(nearElem - avg)) {
                nearElem = avgArr[i];
            }
        }
        System.out.println(nearElem);
    }

}
