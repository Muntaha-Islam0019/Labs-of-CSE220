public class Task06 {
    
    public static boolean palindromeChecked (int [] arr) {
        
        boolean flag = true;
        
        for (int index = 0; index < arr.length/2; index++) {
            if  (  arr[index] != arr[arr.length-1-index] ) {
                flag = false;
                break;
            }
        }
        
        return flag;
    }
    
    public static void main (String [] args) {
        
        int arr [] = {3,5,7,2,4}; 
        
        /* Not taking inputs as in question it is not asked.
         * Though, if one wants to take input of a number then,
         * he/she have to broke the number into parts of an array;
         * possibly by taking as a string and using:
         * str.split().
         * */
        
        if (palindromeChecked(arr) == true) {
            System.out.println ( "It's a palindrome." );
        } else {
            System.out.println ( "It's not a palindrome." );
        }
    }
}
                                   
            