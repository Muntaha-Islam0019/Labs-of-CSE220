import java.util.Scanner;

public class Classwork {
  
  public static double averageFinder (int [] arr) {
    
    double sum = 0;
    
    for ( int i : arr ) {
      sum += i;
    }
    
    double average = sum / arr.length;
    
    return average;
  }
  
  public static void doubler (int [] arr)  {
    arr[0] = arr[0] + arr[0];
  }
  
  public static void main (String [] args) {
    
    Scanner sc = new Scanner (System.in);
    
    System.out.print ( "Please enter a number: " );
    int num = sc.nextInt();
    
    int arr [] = new int [num];
    
    System.out.println ( "Now please enter " + num + " numbers." );
    
    for (int index = 0; index < arr.length; index++) {
      arr[index] = sc.nextInt();
    }
    
    System.out.println ( "Average of these numbers is: " + averageFinder(arr) );
    
    doubler(arr);
    
    System.out.println ( "Average of these numbers after doubling the first value is: " + averageFinder(arr) );
  }
}