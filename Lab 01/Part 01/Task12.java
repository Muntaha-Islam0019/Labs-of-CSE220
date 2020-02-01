public class Task12 {
    
    public static void main (String [] args) {
        
        /* As the question did not ask for taking inputs from user,
         * I ain't doing it.
         * */
        
        System.out.println ( "12/13 comes before 7/19: " + doesItComesBefore(12, 13, 7, 19) );
    }
    
    public static boolean doesItComesBefore (int m1, int d1, int m2, int d2) {
        
        boolean flag = true;
        
        if ( m1 < m2 ) {
            flag = true;
        } else if ( m1 == m2 ) {
            if ( d1 < d2 ) {
                flag = true;
            } else {
                flag = false;
            }
        } else {
            flag = false;
        }
        
        return flag;
    }
}
    
    