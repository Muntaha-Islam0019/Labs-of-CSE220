public class Task10 {
    
    public static String season (int i1, int i2) {
        
        String str = "";
        
        switch (i1) {
            
            case 1: {
                str = "Winter";
                break;
            }
            
            case 2: {
                str = "Winter";
                break;
            }
            
            case 3: {
                if (i2 <= 15) {
                    str = "Winter";
                } else {
                    str = "Spring";
                }
                break;
            }
            
            case 4: {
                str = "Spring";
                break;
            }
            
            case 5: {
                str = "Spring";
                break;
            }
            
            case 6: {
                if (i2 <= 15) {
                    str = "Spring";
                } else {
                    str = "Summer";
                }
                break;
            }
            
            case 7: {
                str = "Summer";
                break;
            }
            
            case 8: {
                str = "Summer";
                break;
            }
            
            case 9: {
                if (i2 <= 15) {
                    str = "Summer";
                } else {
                    str = "Fall";
                }
                break;
            }
            
            case 10: {
                str = "Fall";
                break;
            }
            
            case 11: {
                str = "Fall";
                break;
            }
            
            case 12: {
                if (i2 <= 15) {
                    str = "Fall";
                } else {
                    str = "Winter";
                }
                break;
            }
        }
        
        return str;
    }
    
    public static void main (String [] args) {
        
        /* As the question did not ask for taking inputs from user,
         * I ain't doing it.
         * */
        
        System.out.println ( "It is " + season(7,19) + " season on 7/19." );
    }
}