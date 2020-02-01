public class Task10 {
    
    public static void leftRotate (int arr[], int d) 
    { 
        for (int i = 0; i < d; i++) 
            leftRotatebyOne(arr); 
    } 
  
    public static void leftRotatebyOne (int arr[]) 
    { 
        int i, temp; 
        temp = arr[0]; 
        for (i = 0; i < arr.length - 1; i++) 
            arr[i] = arr[i + 1]; 
        arr[i] = temp; 
    } 
    
    public static void rightRotate (int arr[], int d) 
    { 
        for (int i = 0; i < arr.length - d; i++) 
            leftRotatebyOne(arr); 
        
        /* One don't need a rightRotateByOne as,
         * if we rotate the array on left by
         * the (arr.length-given value), the
         * outcome will be same as they are 
         * equivalent.
         * */
    } 
    
    public static void printArray(int arr[]) 
    { 
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " "); 
        
        System.out.println();
    } 
    
    public static void main (String [] args) {
        
        int arr [] = {1, 4, 8, 16, 25, 36, 49, 64, 81, 100}; 
        int num = 4;
        
        /* For simplification the array and number is given.
         * One can also ask them from user.
         * */
        
        int tempArr1 [] = arr.clone();
        int tempArr2 [] = arr.clone();
        
        leftRotate(tempArr1, num); 
        printArray(tempArr1);
        
        rightRotate(tempArr2, num); 
        printArray(tempArr2);
    }
}