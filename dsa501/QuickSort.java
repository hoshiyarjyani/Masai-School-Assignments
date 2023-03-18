import java.util.*;
class Main {
    static int FindPivot(int[] arr, int s, int e) {
        int i = s - 1;
        int pivot = arr[e];
        for (int j = s; j < e; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[e] = temp;
        return i;
    }
    static void QuickSort(int[] arr, int s, int e) {
        if (s < e) {
            int pivot = FindPivot(arr, s, e);
            QuickSort(arr, s, pivot - 1);
            QuickSort(arr, pivot + 1, e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        QuickSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}