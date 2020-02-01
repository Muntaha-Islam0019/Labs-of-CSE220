import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Task03 {
  public static void main (String [] args) {
    
    Scanner sc = new Scanner(System.in);
    
    Integer [] arr = new Integer [5];
    
    System.out.println ( "Please enter 5 number." );
    
    for (int index = 0; index < arr.length; index++) {
      arr [index] = sc.nextInt();
    }
    
    Arrays.sort(arr, Collections.reverseOrder()); 
    
    /* Reffered at:
     * https://stackoverflow.com/questions/1694751/java-array-sort-descending
     * */
    
    System.out.println ( "Array after sorting: " );
    
    for (int index = 0; index < arr.length; index++) {
      System.out.println ( arr [index] );
    }
    
    for (int index = 0; index < arr.length; index++) {
      if ( arr[index] % 2 == 0 ) {
        System.out.println ( arr [index] );
      }
    }
  }
}