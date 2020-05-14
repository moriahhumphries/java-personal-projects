public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String emailAddress;
    private int phoneNumber;

    public int getAccountNumber(){
        accountNumber = 123456789 ;
        return this.accountNumber;
    }

    public double getBalance(){
        balance = 100.00;
        return this.balance;
    }

    public String getCustomerName(){
        customerName = "Moriah Humphries";
        return this.customerName;
    }

    public String getEmailAddress(){
        emailAddress = "moriah@moriah.com";
        return this.emailAddress;
    }
    public int getPhoneNumber(){
        phoneNumber = 8675309;
        return this.phoneNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public double deposit(double deposit){
        return balance += deposit;
    }
    public double withdraw(double withdraw) {
        if (balance < withdraw) {
            System.out.println("Insufficient funds!");
            return 0;
        } else {
            return balance -= withdraw;
        }
    }
}
