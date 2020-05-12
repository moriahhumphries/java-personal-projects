public class Droid {

    String name;
    int batteryLevel;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    public String toString() {
        return "Hello, I am the droid named " + name + ".";
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task + ".");
        batteryLevel = batteryLevel - 10;

    }

    public int energyReport(){
        System.out.println("Current battery level: " + batteryLevel + ".");
        return batteryLevel;
    }


    public static void main(String[] args) {
        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("dancing");
        codey.energyReport();
    }

}