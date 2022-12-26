public class AdditionInArrayRecursion {
    static int fun(int arr[], int n) {
        if (n <= 0) {
            return 0;
        } else {
            return fun(arr, n - 1) + arr[n - 1];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int x = fun(arr, 5);
        System.out.println(x);
    }
}
