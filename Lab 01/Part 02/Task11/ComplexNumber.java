public class ComplexNumber extends RealNumber {
    
    private double imaginaryValue;
    
    ComplexNumber () {
        super(1.0);
        imaginaryValue = 1.0;
    }
    
    ComplexNumber (double d1, double d2) {
        super(d1);
        imaginaryValue = d2;
    }
    
    public void check () {
        System.out.println("I'm in ComplexNumber class");
        super.ping();
        System.out.println("Checking ended.");
    }
    
    public String toString() {
        return "RealPart: " + getRealValue() + "\n" +
            "ImaginaryPart: " + imaginaryValue;
    }
}