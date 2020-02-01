public class BankAccount {
    private String name, address, accountID;
    private double balance;
    
    BankAccount () {
        name = "Default name";
        address = "Default address";
        accountID = "Default accountID";
        balance = 0.0;
    }
    
    BankAccount (String n, String a, String i, double b) {
        name = n;
        address = a;
        accountID = i;
        balance = b;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public String getAccountID() {
        return accountID;
    }
    
    public void setAccountID(String i) {
        accountID = i;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String a) {
        address = a;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double c) {
        balance = c;
    }
    
    public void addInterest() {
        balance += ((balance*7)/100);
    }
    
    public String toString () {
        String str = "Name of the account manager: " + name + "\n" +
            "Address of the account manager: " + address + "\n" +
            "Account ID of the account: " + accountID + "\n" +
            "Balance of the account: " + balance;
        
        return str;
    }
}