public class QuadEqn {
    
    private int a, b, c;
    
    QuadEqn () {
        
    }
    
    QuadEqn (int i1, int i2, int i3) {
        a = i1;
        b = i2;
        c = i3;
    }
    
    public String toString () {
        String str = "";
        
        str = "("+a+")"+"(x^2)+("+b+"x)+("+c+")";
        
        return str;
    }
    
    public double firstRoot () {
        
        double d = b * b - 4 * a * c; // Determiner
        double root1 = (-b + Math.sqrt(d)) / (2*a);
        
        return root1;
    }
}