public class PracticeMay8 {
    public static void main(String[] args){
        byte myByte = 125;
        short myShort = 2000;
        int myInt = 60000;
        long myLongTotal = 50000L + 10 * (myByte + myShort + myInt);
        System.out.println(myLongTotal);

        // calculate lbs to kg
        double pounds = 17;
        double lbsToKg = pounds * 0.45359237;
        System.out.println(lbsToKg);

    }
}
