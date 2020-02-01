public class Tester {
    
    public static void main(String[] args) {
        
        BankAccount acc1 = new BankAccount ("Sherlock Homes",
                                            "221B Baker Street, Marylebone, London, England.",
                                            "24123SH", 100000.0);
        
        BankAccount acc2 = new BankAccount ("Harry James Potter",
                                            "Godric's Hollow, West Country, England.",
                                            "37346HP", 500000.0);
        
        BankAccount acc3 = new BankAccount ("Thomas Shelby",
                                            "Small Heath, South-East Birmingham, West Midlands, England.",
                                            "12398TS", 10000000.0);
        
        acc1.addInterest();
        acc3.addInterest();
        
        System.out.println(acc1);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(acc2);
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(acc3);
    }
}
