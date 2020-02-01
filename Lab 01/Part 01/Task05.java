import java.util.Scanner;

public class Task05 {
    
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println ( "Please enter 15 numbers (from 0 to 9)." );
        
        int [] counter = new int [10];
        
        for (int count = 1; count <= 15; count++) {
            counter[sc.nextInt()]++;
        }
        
        for (int count = 0; count < counter.length; count++) {
            System.out.println (count + " has been entered " + counter[count] + " times.");
        }
    }
}