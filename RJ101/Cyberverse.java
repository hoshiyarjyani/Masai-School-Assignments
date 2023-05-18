
import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-->0){
            int kid = sc.nextInt();
            int wep = sc.nextInt();
          if(wep>=kid){
              int res = wep/kid;
              System.out.println(res);
          }else{
              System.out.println("0");
          }
        }
      
    }
}
