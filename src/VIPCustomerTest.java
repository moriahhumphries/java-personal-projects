public class VIPCustomerTest {
    public static void main(String[] args) {
    VIPCustomer person1 = new VIPCustomer();
        System.out.println(person1.getName());
        System.out.println(person1.getCreditLimit());
        System.out.println(person1.getEmailAddress());

        VIPCustomer person2 = new VIPCustomer("Iggy", 100);
        System.out.println(person2.getName());
        System.out.println(person2.getCreditLimit());
        System.out.println(person2.getEmailAddress());

        VIPCustomer person3 = new VIPCustomer("Kerrigan", 200, "kerrigan@meow.com");
        System.out.println(person3.getName());
        System.out.println(person3.getCreditLimit());
        System.out.println(person3.getEmailAddress());
    }
}
