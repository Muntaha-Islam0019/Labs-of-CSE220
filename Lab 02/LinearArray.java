import java.util.*;

public class LinearArray{
    public static void main(String [] args){
        int [] a = {10, 20, 30, 40, 50, 60};
        
        System.out.println("\n///// TEST 01: Copy Array example /////");
        int [] b = copyArray(a, a.length);
        printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
        
        System.out.println("\n///// TEST 02: Print Reverse example /////");
        printArray(a); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
        printReverse(a); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
        
        
        System.out.println("\n///// TEST 03: Reverse Array example /////");
        reverseArray(b);
        printArray(b); // This Should Print: { 60, 50, 40, 30, 20, 10 } 
        
        
        System.out.println("\n///// TEST 04: Shift Left k cell example /////");
        b = copyArray(a, a.length);
        b=shiftLeft(b,3);
        printArray(b); // This Should Print: { 40, 50, 60, 0, 0, 0 } 
        
        System.out.println("\n///// TEST 05: Rotate Left k cell example /////");
        b = copyArray(a, a.length); 
        printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
        b=rotateLeft(b,3);
        printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 } 
        
        System.out.println("\n///// TEST 06: Shift Right k cell example /////");
        b = copyArray(a, a.length);
        
        printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
        b=shiftRight(b,3);
        printArray(b);  // This Should Print: { 0, 0, 0, 10, 20, 30 } 
        
        System.out.println("\n///// TEST 07: Rotate Right k cell example /////");
        b = copyArray(a, a.length);
        printArray(b); // This Should Print: { 10, 20, 30, 40, 50, 60 } 
        b=rotateRight(b,3);
        printArray(b); // This Should Print: { 40, 50, 60, 10, 20, 30 } 
        
        
        System.out.println("\n///// TEST 08: Insert example 1 /////");
        
        b = copyArray(a, a.length);
        printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } 
        boolean bol=insert(b,6, 70, 2); // This Should Print: No space Left 
        System.out.println(bol); // This Should Print: false
        printArray(b);  // This Should Print: { 10, 20, 30, 40, 50, 60 } 
        
        System.out.println("\n///// TEST 09: Insert example 2 /////");
        int [] c = {10, 20, 30, 40, 50, 0, 0}; 
        printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 }
        bol=insert(c,5, 70, 2);  // This Should Print: Number of elements after insertion: 6
        System.out.println(bol); // This Should Print: true
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
        
        System.out.println("\n///// TEST 10: Insert example 3 /////");
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 0 } 
        bol=insert(c,6, 70, 6); // This Should Print: Number of elements after insertion: 7 
        System.out.println(bol); // This Should Print: true
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
        
        System.out.println("\n///// TEST 11: Remove example 1 /////");
        
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
        bol=removeAll(c,7,90);
        System.out.println(bol); // This Should Print: false
        printArray(c); // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
        
        System.out.println("\n///// TEST 12: Remove example 2 /////");
        printArray(c);  // This Should Print: { 10, 20, 70, 30, 40, 50, 70 } 
        bol=removeAll(c,7,70);
        System.out.println(bol); // This Should Print: true
        printArray(c);  // This Should Print: { 10, 20, 30, 40, 50, 0, 0 } 
        
        
        
    }
    
    // Prints the contents of the source array
    public static void printArray(int [] source){
        // TO DO
        
        System.out.print("{");
        for (int index = 0; index < source.length; index++) {
            
            if (index != source.length-1) {
                System.out.print(" " + source[index] + ",");
            } else {
                System.out.print(" " + source[index] + " ");
            }
        }
        System.out.print("}\n");
    }
    
    // Prints the contents of the source array in reverse order
    public static void printReverse(int [] source){
        // TO DO
        
        System.out.print("{");
        for (int index = source.length-1; index >= 0; index--) {
            
            if (index != 0) {
                System.out.print(" " + source[index] + ",");
            } else {
                System.out.print(" " + source[index] + " ");
            }
        }
        System.out.print("}\n");
        
    }
    
    // creates a copy of the source array and returns the reference of the newly created copy array
    public static int [] copyArray(int [] source, int len){
        // TO DO
        
        int [] tempArr = new int [len];
        
        for (int index = 0 ; index < source.length; index++) {
            tempArr[index] = source[index];
        }
        
        return tempArr; 
    }
    
    // creates a reversed version of the source array 
    public static void reverseArray(int [] source){
        // TO DO
        int i = 0;
        int j = source.length-1;
        
        while (i<j) {
            int temp = source[i];
            source[i] = source[j];
            source[j] = temp;
            
            i++;
            j--;
        }
    }
    
    // Shifts all the elements of the source array to the left by 'k' positions
    // Returns the updated array
    public static int [] shiftLeft(int [] source, int k){
        // TO DO
        
        int [] arr = copyArray(source, source.length);
        
        while (k-- != 0) {
            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = 0;
        }
        
        return arr;    
    }
    
    // Rotates all the elements of the source array to the left by 'k' positions
    // Returns the updated array
    public static int [] rotateLeft(int [] source, int k){
        // TO DO
        
        int array [] = copyArray(source, source.length);
        
        while (k-- != 0) {
            
            int firstElement = array[0];
            
            for (int i = 1; i < array.length; i++)
                array[i - 1] = array[i];
            
            array[array.length - 1] = firstElement;
        }
        
        return array;    
    }
    
    // Shifts all the elements of the source array to the right by 'k' positions
    // Returns the updated array
    public static int [] shiftRight(int [] source, int k){
        // TO DO
        
        int [] array = copyArray(source, source.length);
        
        while (k-- != 0) {
            for (int i = array.length - 1; i > 0; i--)
                array[i] = array[i - 1];
            array[0] = 0;
        }
        
        return array; 
    }
    
    // Rotates all the elements of the source array to the right by 'k' positions
    // Returns the updated array
    public static int [] rotateRight(int [] source, int k){
        // TO DO
        
        int array [] = copyArray(source, source.length);
        
        while (k-- != 0) { 
            int lastElement = array[array.length - 1];
            for (int i = array.length - 1; i > 0; i--)
                array[i] = array[i - 1];
            array[0] = lastElement; 
        }
        
        return array;   
    }
    
    /** @return true if insertion is successful; @return false otherwise
      * @param arr the reference to the linear array
      * @param size the number of elements that exists in the array. size<=arr.length
      * @param elem the element that is to be inserted
      * @param index the index in which the element is required to be inserted
      * if insertion is not successful due to lack space, print "No space Left"
      * if given index is invalid, print "Invalid Index"
      * if insertion is successful, print the 'Number of elements after insertion' is completed
      */
    public static boolean insert(int [] arr, int size, int elem, int index){
        // TO DO
        
        if (index >= arr.length) {
            System.out.println("Invalid Index");
            return false;
        } else {
            
            boolean flag = false;
            
            int num = 0;
            
            /* As I did not know about the size variables job,
             * I declared this num variable to find out the element
             * count of the array. This obviously can
             * be done by the size variable.
             * Sorry for making the code larger.
             * */
            
            for (int x: arr) {
                if (x!=0) {
                    num++;
                }
            }
            
            if (num == arr.length) {
                System.out.println("No space Left");
            } else {
                flag = true;
                
                for (int i = num; i > index-1; i--)
                    arr[i] = arr[i - 1];
                
                arr[index] = elem;
                
                System.out.println("Number of elements after insertion: " + ++num);
            }
            
            return flag;
        }
    }
    
    /** 
     * removes all the occurences of the given element
     * @param arr the reference to the linear array
     * @param size the number of elements that exists in the array. size<=arr.length
     * @param elem the element to be removed
     * @return true if removal is successful; return false otherwise
     * if removal is successful, print the 'Number of elements after removal' is completed
     */  
    public static boolean removeAll(int [] arr, int size, int elem){
        // TO DO
        
        boolean flag = false;
        
        for (int index = 0; index < arr.length; index++) {
            
            if (arr[index] == elem) {
                
                flag = true;
                arr[index] = 0;
                
                for (int count = index; count < arr.length-1; count++) {
                    
                    arr[count] = arr[count+1];
                    arr[count+1] = 0;
                }
            }
        }
        
        return flag;
    }

}
