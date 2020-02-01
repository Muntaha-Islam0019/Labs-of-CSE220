public class Square {
    
    private double height, width;
    
    Square () {
        height = 0.0;
        width = 0.0;
    }
    
    Square (double d1, double d2) { // Instructed in Task07.
        height = d1;
        width = d2;
    }
    
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double h) {
        height = h;
    }
    
    public double getWidth () {
        return width;
    }
    
    public void setWidth (double w) {
        width = w;
    }
    
    public double getArea () {
        return height*width;
    }
    
}