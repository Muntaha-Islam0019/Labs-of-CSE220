public class Date {
    
    private int day;
    private int month;
    private int year;
    
    Date () {
        day = 0;
        month = 0;
        year = 0;
    }
    
    Date (int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }
    
    public void setDay (int i) {
        day = i;
    }
    
    public void setMonth (int i) {
        month = i;
    }
    
    public void setYear (int i) {
        year = i;
    }
    
    public int getDay () {
        return day;
    }
    
    public int getMonth () {
        return month;
    }
    
    public int getYear () {
        return year;
    }
    
    public void displayDate () {
        System.out.println("Date in DD/MM/YYYY format: " + getDay() + "/" + getMonth() + "/" + getYear());
    }
}