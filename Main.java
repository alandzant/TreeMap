import java.util.Collection;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Volodya", "Aleshin", 10));
        persons.add(new Person("Aleksey","Volodinin-Petrov", 20));
        persons.add(new Person("Egor","Petrov-Alekseev-Ivin",30));
        persons.add(new Person("Vlad","Minin",15));

        persons.removeIf(person -> person.getAge()<18);


        persons.forEach(System.out::println);
    }
}