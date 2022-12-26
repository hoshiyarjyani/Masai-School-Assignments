
public class NickAndHacksRupeesRecursion {
    static boolean myFun(int n, int r) {
        if (n == r) {
            return true;
        }else if(r>n){
            return false;
        }
         else {
            return myFun(n, r * 10) || myFun(n, r * 20);
        }
    }

    public static void main(String[] args) {
        boolean x = myFun(25, 1);
        if (x == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
