import java.lang.reflect.Array;
import java.util.Arrays;



public class ArraysExercises {
    public static void main(String[] args) {

        PracticePerson Moriah = new PracticePerson("Moriah");
        PracticePerson[] people = new PracticePerson[3];
        people[0] = new PracticePerson("Moriah");
        people[1] = new PracticePerson("Andrew");
        people[2] = new PracticePerson("Iggy");

        for (PracticePerson person : people) {
            System.out.println(person.getName());
        }
    }
       public static PracticePerson[] addPerson(PracticePerson[] people, PracticePerson person) {
        PracticePerson[] newPeopleArray = new PracticePerson[people.length + 1];

        for(int i = 0; i < people.length; i++){
            newPeopleArray[i] = people[i];
        }
        newPeopleArray[newPeopleArray.length - 1] = person;

        return newPeopleArray;

    }

    }

