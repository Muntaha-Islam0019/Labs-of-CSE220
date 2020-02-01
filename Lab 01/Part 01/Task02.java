import java.util.Scanner;

public class Task02 {
  
  public static int minimumsIndex (int [] arr) {
    
    int min = arr[0];
    int pos = 0;
    
    for (int index = 0; index < arr.length; index++) {
      if ( arr[index] > min ) {
        min = arr[index];
        pos = index;
      }
    }
    
    return pos;
  }
  
  public static int maximumsIndex (int [] arr) {
    
    int max = arr[0];
    int pos = 0;
    
    for (int index = 0; index < arr.length; index++) {
      if ( arr[index] < max ) {
        max = arr[index];
        pos = index;
      }
    }
    
    return pos;
  }
  
  public static void swapper (int [] arr) {
    
    int tempVar;
    int minPos = minimumsIndex(arr);
    int maxPos = maximumsIndex(arr);
    
    tempVar = arr[minPos];
    arr[minPos] = arr[maxPos];
    arr[maxPos] = tempVar;
  }
  
  public static void main (String [] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println ( "Please enter 10 numbers." );
    
    int [] arr =  new int [10];
    
    for (int index = 0; index < arr.length; index++) {
      arr [index] = sc.nextInt();
    }
    
    swapper(arr);
    
    System.out.println ( "Your numbers after swapping: " );
    
    for (int index = 0; index < arr.length; index++) {
      System.out.println (arr [index]);
    }
  }
}