import java.util.ArrayList;

import entities.Dog;
import entities.Person;

public class App {
    public static void main(String[] args) {
        ArrayList<Dog> availableDogs = new ArrayList<>();
        Dog dog1 = new Dog("Buddy", "Labrador", 3, "Medium");
        Dog dog2 = new Dog("Charlie", "Poodle", 2, "Small");
        Dog dog3 = new Dog("Max", "German Shepherd", 4, "Large");
        Dog dog4 = new Dog("Oscar", "Beagle", 1, "Small");
        Dog dog5 = new Dog("Milo", "Bulldog", 2, "Medium");

        availableDogs.add(dog1);
        availableDogs.add(dog2);
        availableDogs.add(dog3);
        availableDogs.add(dog4);
        availableDogs.add(dog5);

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice", "Johnson", 28, "123456"));
        people.add(new Person("Bob", "Smith", 35, "789012"));

        for (Person person : people) {
            System.out.println(person);
            System.out.print("Enter the name of the dog you want to adopt (or 'none' to skip): ");
            String dogName = System.console().readLine();

            if (!dogName.equalsIgnoreCase("none")) {
                person.adoptDogByName(dogName, availableDogs);
            }
        }
        
        
        for (Person person : people) {
            System.out.println();
            System.out.println(person);
        }

    }
}
