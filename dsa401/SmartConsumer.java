import java.util.Scanner;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i = 0; i< tc; i++){
           int n = sc.nextInt();
           int cPrice = sc.nextInt();
           int discount = sc.nextInt();
          int [] arr = new int[n];
          
          for(int j = 0; j<n;j++){
              arr[j]=sc.nextInt();
          }
        
      String str = CheckBuy(n,cPrice,discount,arr);
          System.out.println(str);    
      }
    }
    
    static String CheckBuy(int n,int cPrice,int discount,int [] arr){
        int arrSum = 0;
        int priceTotelDis = 0;
        for(int i = 0; i<n;i++){
            if(arr[i]>=discount){
                priceTotelDis+=arr[i]-discount;
            }
            arrSum+=arr[i];
        }
       int totel =priceTotelDis+cPrice;     
        if(totel>=arrSum){
            return "NO";
        }else{
            return "YES";
        }
        
    }
    
}