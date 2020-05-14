public class BankAccountTest {
    public static void main(String[] args) {
    BankAccount account = new BankAccount();
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Account balance: $" + account.getBalance());
        System.out.println("Customer name: " + account.getCustomerName());
        System.out.println("Customer email: " + account.getEmailAddress());
        System.out.println("Customer phone number: " + account.getPhoneNumber());
        System.out.println("Account balance after deposit: $" + account.deposit(50));
        System.out.println("Account balance after withdraw: $" + account.withdraw(20));






    }


}
