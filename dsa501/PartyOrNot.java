import java.util.*;
class Main{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();
         int r = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 0;
        for(int i =0; i<n;i++){
            if(r-arr[i]>=0){
                count++;
                r-=arr[i];
            }
        }
        if(count>=f){
             System.out.println("Party");
        }else{
             System.out.println("Sad");
        }
       
    }
}