import java.util.Scanner;

public class Task07 {
    
    public static String starMaker (int [] arr, int i) {
        
        String str = "";
        
        for (int index = 1; index <= arr[i]; index++) {
            str += "*";
        }
        
        return str;
    }
    
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println( "Please enter 10 values for an array." );
        
        int [] arr = new int [10];
        
        for (int index = 0; index < arr.length; index++) {
            arr[index] = sc.nextInt();
        }
        
        System.out.println( "Please enter an index number." );
        
        int indexNo = sc.nextInt();
        
        System.out.println(starMaker(arr, indexNo));
    }
}
                           