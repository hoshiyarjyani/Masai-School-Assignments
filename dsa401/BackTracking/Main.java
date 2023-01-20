package BackTracking;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
  ArrayList<String> list = new ArrayList<String>();

  public Main(String x) {
    // constructor code here
    list.add(x);
  }

  public void printSortedList() {
    Collections.sort(list);

    for (String s : list) {
      System.out.println(s);
    }
  }
}

class Mains {
  public static void subSequence(String str, int index, String current) {
    if (index == str.length()) {
      //System.out.println(current);
      Main m = new Main(current);
      m.printSortedList();
      return;
    } 
    
    subSequence(str, index + 1, current + str.charAt(index));
    subSequence(str, index + 1, current);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  
    String x = sc.nextLine();
    int n = Integer.parseInt(x);
    String str = sc.nextLine();
    
    subSequence(str, 0, ""); // function calling first time
  }
}
