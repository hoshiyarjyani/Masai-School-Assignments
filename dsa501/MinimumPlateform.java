import java.util.*;
class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arrival =new int[n];
for(int i = 0; i<n;i++){
    String[] parts  = sc.next().split(":");
    int hour = parts[0];
    int minute = parts[1];
    arrival[i] = hour*60+minute;
}
int [] depart =new int[n];
for(int i = 0; i<n;i++){
    String[] parts  = sc.next().split(":");
    int hour = parts[0];
    int minute = parts[1];
    depart[i] = hour*60+minute;
}
Arrays.sort(arrival);
Arrays.sort(depart);

int Plateformneed = 0;
int minPlateform = 0;
int i =0;
int j =0;

while(i<n && j<n){
    if(arrival[i]<=depart[j]){
        Plateformneed++;
        i++;
        if(Plateformneed>minPlateform){
            minPlateform = Plateformneed;
        }
    }else{
        Plateformneed--;
        j++;
    }
}
System.out.println(minPlateform);
    }
}