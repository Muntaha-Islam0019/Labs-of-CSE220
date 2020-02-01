public class Task01 {
  
  public static boolean checker (int [] arr) {
    
    boolean flag = false;
    
    if ( arr [0] == 6 || arr [arr.length-1] == 6) {
      flag = true;
    }
    
    return flag;
  }
  
  public static void main (String [] args) {
    
    int [] arr = {2,4,5,3,5};
    
    /* As the question says,
     * Given an array of ints,
     * I've made one,
     * which can obviously be changed later. 
     * */
    
    System.out.println( checker(arr) );
  }
}