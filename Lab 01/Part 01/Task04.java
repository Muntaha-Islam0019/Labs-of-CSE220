import java.util.Scanner;
import java.util.ArrayList;

public class Task04 {
  
  public static void main (String [] args) { 
    
    Scanner sc = new Scanner (System.in);
    
    ArrayList <Integer> arrList = new ArrayList <Integer> (10);
    
    for (int index = 0; index < 10; index++) {
      
      System.out.print ( "Please enter a number" );
      int num = sc.nextInt();
      
      if ( arrList.contains(num) ) {
        System.out.println ( "This number has already been entered." );
        index--;
      } else {
        arrList.add(num);
      }
    }
    
    System.out.println ( arrList ) ;
  }
}