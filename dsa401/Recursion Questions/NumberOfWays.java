public class NumberOfWays {
    static int myFun(int n) {
        if(n<0){
            return 0;
        }else if (n == 0) {
            return 1;
        } else {
            return myFun(n - 1) + myFun(n - 2) + myFun(n - 3);
        }
    }

    public static void main(String[] args) {
        int x = myFun(4);
        System.out.println(x);
    }
}
