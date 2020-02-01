public class Tester {
    
    public static void main (String [] args) {
        
        QuadEqn q = new QuadEqn (1, -5, 6);
        
        System.out.println("The equation is: " + q);
        
        System.out.println("The 1st root is: " + q.firstRoot());
    }
}