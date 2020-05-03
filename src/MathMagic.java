// 3 will be printed to console for all original number inputs
public class MathMagic {
    public static void main(String[] args) {
        int myNumber = 5;
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;

        System.out.println(stepSix);



    }
}