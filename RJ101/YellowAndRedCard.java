import java.util.*;
class YellowAndRedCard{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int arr[] = new int[n];
        
        while(k-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==1){
                arr[b-1]++;
            }else if(a==2){
                arr[b-1]=2;
            }else if(a==3){
                System.out.println((arr[b-1]<2)?"No":"Yes");
            }
        }
    }
}

// Input

// 3 9
// 3 1
// 3 2
// 1 2
// 2 1
// 3 1
// 3 2
// 1 2
// 3 2
// 3 3

// Output

// No
// No
// Yes
// No
// Yes
// No