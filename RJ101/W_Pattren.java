import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<4*n;j++){
              if(i==j || j==i+(2*n)){
                  System.out.print("\\");
              }else if(i+j==(2*n)-1){
                  System.out.print("/");
              }else if(i+j==(4*n)-1){
                  System.out.print("/");
                  break;
              }else{
                   System.out.print(" "); 
              }   
            }
            System.out.println();
        }
    }
}