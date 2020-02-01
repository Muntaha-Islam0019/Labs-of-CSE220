import java.util.Scanner;

public class Task09 {
    
    public static void main (String [] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int [] arr = new int [10];
        
        System.out.println ("Please provide 10 values for 10 indexes of an array");
        
        for (int index = 0; index < arr.length; index++) {
            arr[index] = sc.nextInt();
        }
        
        printArr(arr, arr.length);
        squareMaker(arr, arr.length);
        printArr(arr, arr.length);
    }
    
    public static void printArr (int [] arr, int i) {
        for (int index = 0; index < arr.length; index++) {
            System.out.print (arr[index] + " ");
        }
        System.out.println ();
    }
    
    public static void squareMaker (int [] arr, int i) {
        for (int index = 0; index < arr.length; index++) {
            arr[index] *= arr[index];
        }
    }
}