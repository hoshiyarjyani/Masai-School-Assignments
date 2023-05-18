import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int n = sc.nextInt();
            String str = sc.next();
            int ans = n;
            for(int i = 0;i<n/2;i++){
                if((str.charAt(i)=='0' && str.charAt(n-i-1)=='1') || (str.charAt(i)=='1' && str.charAt(n-i-1)=='0')){
                    ans-=2;
                }else{
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}