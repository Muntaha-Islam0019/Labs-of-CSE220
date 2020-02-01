import java.util.Scanner;

public class Task08 {
    
    public static void main (String [] argts) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print ("Please enter the dimension/size of row matrices of your desire: ");
        int dim = sc.nextInt();
        
        System.out.println ("Now please enter a row matrix of your desired dimension/size.");
        
        int arr1 [] = new int [dim];
        
        for (int index = 0; index < arr1.length; index++) {
            arr1[index] = sc.nextInt();
        }
        
        System.out.println ("Now please enter another row matrix of your desired dimension/size.");
        
        int arr2 [] = new int [dim];
        
        for (int index = 0; index < arr2.length; index++) {
            arr2[index] = sc.nextInt();
        }
        
        System.out.print ("Result of these two matrices using 'C=5A-B' equation: ");
        
        for (int index = 0; index < arr1.length; index++) {
            System.out.print ( ((arr1[index]*5) - arr2[index]) + " " );
        }
        
        System.out.println ();
    }
}
        
        