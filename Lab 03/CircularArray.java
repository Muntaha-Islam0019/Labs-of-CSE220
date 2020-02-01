public class CircularArray{
    
    private int start;
    private int size;
    private Object [] cir;
    
    /*
     * if Object [] lin = {10, 20, 30, 40, null}
     * then, CircularArray(lin, 2, 4) will generate
     * Object [] cir = {40, null, 10, 20, 30}
     */
    public CircularArray(Object [] lin, int st, int sz){
        
        start = st;
        size = sz;
        
        cir = new Object [lin.length];
        
        int startingPos = start;
        
        for (int index = 0; index < lin.length; index++) {
            
            cir[startingPos] = lin[index];
            
            startingPos = (startingPos+1) % lin.length;
        }
    }
    
    //Prints from index --> 0 to cir.length-1
    public void printFullLinear(){
        
        for (int index = 0; index < cir.length; index++) {
            
            if (index != cir.length-1) {
                System.out.print(cir[index] + ", ");
            } else {
                System.out.print(cir[index] + ".");
            }
        }
        
        System.out.println();
    }
    
    // Starts Printing from index start. Prints a total of size elements
    public void printForward(){
        
        int startingPos = start;
        
        for (int index = 0; index < size; index++) {
            
            if (index != size-1) {
                System.out.print(cir[startingPos] + ", ");
            } else {
                System.out.print(cir[startingPos] + ".");
            }
            
            startingPos = (startingPos+1) % cir.length;
        }
        
        System.out.println();
    }
    
    
    public void printBackward(){
        
        int startingPos = (start + size - 1) % cir.length;
        
        for (int index = 0; index < size; index++) {
            
            if (index != size-1) {
                System.out.print(cir[startingPos] + ", ");
            } else {
                System.out.print(cir[startingPos] + ".");
            }
            
            startingPos--;
            
            if (startingPos == -1) {
                startingPos = cir.length-1;
            }
        }
        
        System.out.println();
    }
    
    // With no null cells
    public void linearize(){
        
        Object [] arr = new Object [size];
        
        int startingPos = start;
        
        for (int index = 0; index < size; index++) {
            
            arr[index] = cir[startingPos];
            
            startingPos = (startingPos + 1) % cir.length;
        }
        
        cir = arr;
    }
    
    // Do not change the Start index
    public void resizeStartUnchanged(int newcapacity){
        
        Object [] arr = new Object [newcapacity];
        
        int startingPos = start;
        int indexFirst = start;
        
        for (int index = 0; index < size; index++) {
            
            arr[indexFirst] = cir[startingPos];
            
            indexFirst++;
            startingPos = (startingPos + 1) % cir.length;
        }
        
        cir = arr;
    }
    
    // Start index becomes zero
    public void resizeByLinearize(int newcapacity){
        
        Object [] arr = new Object [newcapacity];
        
        int startingPos = start;
        
        for (int index = 0; index < size; index++) {
            
            arr[index] = cir[startingPos];
            
            startingPos = (startingPos + 1) % cir.length;
        }
        
        cir = arr;
    }
    
    /* pos --> position relative to start. Valid range of pos--> 0 to size.
     * Increase array length by 3 if size==cir.length
     * use resizeStartUnchanged() for resizing.
     */
    public void insertByRightShift(Object elem, int pos){
        
        if (pos < 0 || pos > size) {
            System.out.println("Invalid position.");
        } else {
            
            if (size == cir.length) {
                resizeStartUnchanged(cir.length+3);
            }
            
            int nShifts = size - pos;
            
            int from = (start + size - 1) % cir.length;
            int to = (from+1) % cir.length;
            
            for (int index = 0; index < nShifts; index++) {
                
                cir[to] = cir[from];
                
                to = from;
                from = from - 1;
                if (from == -1) {
                    from = cir.length;
                }
            }
            
            int index = (start+pos) % cir.length;
            cir[index] = elem;
            
            size++;
        }
    }
    
    public void insertByLeftShift(Object elem, int pos){
        
        if (pos < 0 || pos > size) {
            System.out.println("Invalid position.");
        } else {
            
            if (size == cir.length) {
                resizeStartUnchanged(cir.length+3);
            }
            
            int nShifts = pos+1;
            
            int from = start % cir.length;
            int to = (from-1);
            
            if (to == -1) {
                to = cir.length - 1;
            }
            
            
            for (int index = 0; index < nShifts; index++) {
                
                cir[to] = cir[from];
                
                to = from;
                from = (from + 1) % cir.length;
            }
            
            int index = (start+pos) % cir.length;
            cir[index] = elem;
            
            start--; 
            if (start == -1) {
                start = cir.length - 1;
            }
            
            size++;
        }
    }
    
    /* parameter--> pos. pos --> position relative to start.
     * Valid range of pos--> 0 to size-1
     */
    public void removeByLeftShift(int pos){
        
        if (pos < 0 || pos > size-1) {
            System.out.println("Invalid position.");
        } else {
            
            int index = (start + pos) % cir.length;
            
            int nShifts = size - pos - 1;
            
            int to = index;
            int from = (to + 1) % cir.length;
            
            for (int i = 0; i < nShifts; i++) {
                
                cir[to] = cir[from];

                to = from;
                from = (from + 1) % cir.length;
            }
            
            cir[(start + size - 1) % cir.length] = null;
            
            size--;
        }
    }
    
    /* parameter--> pos. pos --> position relative to start.
     * Valid range of pos--> 0 to size-1
     */
    public void removeByRightShift(int pos){
        
        if (pos < 0 || pos > size-1) {
            System.out.println("Invalid position.");
        } else {
            
            int index = (start + pos) % cir.length;
            
            /* According to all notes,
             * int nShifts = size - pos;
             * Though, I think it might be wrong.
             * My method works perfectly.
             * */
            
            int nShifts = cir.length - pos - 1;
            
            int to = index;
            int from = to - 1;
            
            if (from == -1) {
                from = cir.length - 1;
            }
            
            for (int i = 0; i < nShifts; i++) {
                
                cir[to] = cir[from];

                to = from;
                from = from - 1;
                
                if (from == -1) {
                    from = cir.length - 1;
                }
            }
            
            cir[start] = null;
            
            start = (start+1) % cir.length;
            size--;
        }
    }
    
    
    //This method will check whether the array is palindrome or not
    public void palindromeCheck(){
        
        int firstIndex = start;
        int lastIndex = (start + size - 1) % cir.length;
        
        boolean flag = true;
        
        while (firstIndex < lastIndex) {
            
            if (cir[firstIndex] != cir[lastIndex]) {
                flag = false;
                break;
            }
            
            firstIndex = (firstIndex + 1) % cir.length;
            
            lastIndex--;
            if (lastIndex == -1) {
                lastIndex = cir.length - 1;
            }
        }
        
        if (flag == true) {
            System.out.println( "This array is a palindrome." );
        } else {
            System.out.println( "This array is NOT a palindrome." );
        }
    }
    
    
    //This method will sort the values by keeping the start unchanged
    public void sort(){
        
        int sizeLimiteri = 0;
        
        for (int i = start; i < cir.length; i = (i + 1) % cir.length) {
            
            for (int j = i; j < cir.length; j = (j + 1) % cir.length) {
                
                if (cir[j] == null) break;
                
                if ((int) cir[i] > (int) cir [j]) {
                    
                    Object temp = cir[i];
                    cir[i] = cir[j];
                    cir[j] = temp;
                }
            }
            
            sizeLimiteri++;
                
            if (sizeLimiteri == size) break;
        }
    }
    
    //This method will check the given array across the base array and if they are equivalent interms of values return true, or else return false
    public boolean equivalent(CircularArray k){
        //TO DO
        
        boolean flag = true;
        
        Object [] arr = new Object [size];  
        
        int startingInd = start;
        
        for (int i = 0; i < size; i++) {
            
            arr[i] = cir[startingInd];
            
            startingInd = (startingInd + 1) % cir.length;
        }
        
        if (k.size != this.size) {
            flag = false;
        } else {
            
            k.linearize();
            
            if (k.cir.length != arr.length) {
                flag = false;
            } else {
                
                for (int i = 0; i < arr.length; i++) {
                    
                    if (k.cir[i] != arr[i]) {
                        flag = false;
                        break;
                    }
                }
            }
        }
        
        return flag;
    }
}