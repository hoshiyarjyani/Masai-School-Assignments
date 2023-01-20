package conceptofjava;

public class InterfaceStringClass {
    
}


/*
interface stringFunctions{
  public void print(String a,String b);
  public int countVowels(String a,String b);
  public int countConsonants(String a,String b);
  public int valueOfString(String a,String b);
}
*/
class strClassOne implements stringFunctions {

    public void Print(String a, String b) {
      System.out.println(a + " " + b);
    }
  
    public int countVowels(String a, String b) {
      String s = a + b;
      int count = 0;
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
          count++;
        }
      }
      return count;
    }
  
    public int countConsonants(String a, String b) {
      String s = a + b;
      int count = 0;
      int count1 = 0;
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
          count1++;
        }else{
           count++; 
        }
      }
      return count;
    }
  
  
    public int valueOfString(String a, String b) {
      String s = a + b;
      int sum = 0;
      for (int i = 0; i < s.length(); i++) {
        sum += (int) s.charAt(i);
      }
      return sum;
    }
  }
  
  