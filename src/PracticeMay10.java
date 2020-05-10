public class PracticeMay10 {
    public static void main(String[] args){
        displayHighScorePosition("Moriah", calculateHighScorePosition(11));

    }

    public static void displayHighScorePosition(String name, int scorePosition){
        System.out.println("Hello, " + name + " you are in high score position: " + scorePosition);
    }

    public static int calculateHighScorePosition(int score){
        if (score > 1000) {
            return 1;
        } else if (score >= 500 && score <= 1000) {
            return 2;
        } else if (score > 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
