package BackTracking;

public class Permutation {
    static void perFun(String str, int l, int r) {
if(l==r){
    System.out.println(str);
}else{
   for(int i = l;i<=r;i++){
    str = swap(str,l,i);
    perFun(str, l+1, r);
   } 
}
    }

    static String swap(String str, int l, int i) {
       String s =  
        return null;
    }

    public static void main(String[] args) {
        String str = "ABC";
        perFun(str, 0, 2);
    }
}
