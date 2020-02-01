public class Task11 {
    
    public static boolean allDigitsOdd ( long i ) {
        
        boolean flag = true;
        
        while (i != 0) {
            long div = i % 10;
            
            if (div % 2 != 0) {
                flag = true;
            } else {
                flag = false;
                break;
            }
            
            i /= 10;
        }
        
        return flag;
    }
    
    public static void main (String [] args) {
        
        /* As the question did not ask for taking inputs from user,
         * I ain't doing it.
         * */
        
        System.out.println ( "All digits of 643138426 is odd: " + allDigitsOdd(135319) );
    }
}