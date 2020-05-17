public class FlooringTest {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculate calculate = new Calculate(floor, carpet);
        System.out.println("total= " + calculate.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculate = new Calculate(floor, carpet);
        System.out.println("total= " + calculate.getTotalCost());

    }
}
