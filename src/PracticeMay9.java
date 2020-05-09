public class PracticeMay9 {
    public static void main (String[] args){
        // Operator Challenge

        double first = 20.00;
        double second = 80.00;
        double total = (first + second) * 100.00;
        System.out.println("Total = " + total);
        double remainder = total % 40.00;
        System.out.println("Total remainder = " + remainder);
        boolean noRemainder = remainder == 0 ? true : false;
        System.out.println("Is there no remainder? " + noRemainder);
        if (!noRemainder) {
            System.out.println("Got some remainder");
        }

    }
}
