public class Test{
    public static int [] removeOdd (int [] input){
        //Your code here
        
        /* It could be done more efficiently by ArrayList if return type was not int[].
         * As, toArray() method returns an array of type Object(Object[]).
         * We need to typecast it to Integer before using as Integer objects.
         * If we do not typecast, we get compilation error.
         * */
        
        int evenCounter = 0;
        
        for (int x : input) {
            if (x % 2 == 0) {
                evenCounter++;
            }
        }
        
        int index = 0;
        int [] arr = new int [evenCounter];
        
        for (int x : input) {
            if (x % 2 == 0) {
                arr[index] = x;
                index++;
            }
        }
        
        return arr;
    }
    public static void main(String [] args){
        int [] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
        for (int i = 0; i < mixedArray.length; i++) {
            System.out.print(mixedArray[i] + " ");
        }
        System.out.println();
        int [] noOdd = removeOdd(mixedArray);
        for (int i = 0; i < noOdd.length; i++) {
            System.out.print(noOdd[i] + " ");
        }    
    }
}
