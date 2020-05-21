public class PracticePerson {
    private String name;

    public PracticePerson(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void SayHello(){
        System.out.println("Hello, "+ this.getName());
    }

    public static void main(String[] args) {
        PracticePerson person = new PracticePerson("Moriah");
        person.SayHello();


//    PracticePerson person1 = new PracticePerson("John");
//    PracticePerson person2 = new PracticePerson("John");
//System.out.println(person1.getName().equals(person2.getName()));
//System.out.println(person1 == person2);

//        PracticePerson person1 = new PracticePerson("John");
//        PracticePerson person2 = person1;
//        System.out.println(person1 == person2);
//
//        PracticePerson person1 = new  PracticePerson("John");
//        PracticePerson person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
}
}
