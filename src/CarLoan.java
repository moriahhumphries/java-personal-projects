public class CarLoan {
    public static void main(String[] args) {
        int carLoan = 10000;
        int loanLength = 3;
        int interestRate = 5;
        int downPayment = 2000;

        if ((loanLength <= 0) || (interestRate <= 0)) {
            System.out.println("Error! You must take out a valid car loan.");
        } else if (downPayment >= carLoan) {
            System.out.println("You don't need a loan");
        } else {
            int remainingBalance = carLoan - downPayment;
            System.out.println("Your total balance is " + remainingBalance);
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = (monthlyBalance * interestRate) / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println("Your monthly payment is: "+ monthlyPayment);
        }



    }
}