public class MergeSort {

    static void merge(int[] arr, int s, int mid, int e) {

        int[] mergedArr = new int[e - s + 1];
        // 5 3 6 1 2 4
        int i = s; // 0
        int j = mid + 1; // 3
        int k = 0;

        while (i <= mid && j <= e) {
            if (arr[i] <= arr[j]) {
                mergedArr[k++] = arr[i++];
            } else {
                mergedArr[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            mergedArr[k++] = arr[i++];
        }
        while (j <= e) {
            mergedArr[k++] = arr[j++];
        }

        for (int a = 0; a < mergedArr.length; a++) {
            arr[s + a] = mergedArr[a];
        }

    }

    static void divide(int[] arr, int s, int e) {

        if (s >= e)
            return;

        int mid = s + (e - s) / 2;

        divide(arr, s, mid);
        divide(arr, mid + 1, e);

        merge(arr, s, mid, e);

    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 6, 1, 2, 4 };
        int n = arr.length;

        divide(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
