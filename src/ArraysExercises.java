import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] people, Person person){
        Person[] nPeople = Arrays.copyOf(people,people.length+1);
        nPeople[nPeople.length-1] = person;
        return nPeople;
    }


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("Larry");
        people[1] = new Person("Terry");
        people[2] = new Person("Jerry");
        System.out.println(people[0].getName());
        System.out.println(people[1].getName());
        System.out.println(people[2].getName());

        Person person = new Person("Barry");
        Person[] people2 = addPerson(people,person);

        System.out.println(people2[0].getName());
        System.out.println(people2[1].getName());
        System.out.println(people2[2].getName());
        System.out.println(people2[3].getName());





    }
}
