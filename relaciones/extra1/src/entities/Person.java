package entities;

import java.util.ArrayList;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String document;
    private Dog adoptedDog;

    public Person(String firstName, String lastName, int age, String document) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.document = document;
    }

    public boolean adoptDog(Dog dog) {
        if (!dog.isAdopted()) {
            adoptedDog = dog;
            dog.adopt();
            return true;
        } else {
            System.out.println("Sorry, " + dog.toString() + " has already been adopted.");
            return false;
        }
    }

        public boolean adoptDogByName(String dogName, ArrayList<Dog> availableDogs) {
        Dog selectedDog = null;
        for (Dog dog : availableDogs) {
            if (dog.getName().equalsIgnoreCase(dogName) && !dog.isAdopted()) {
                selectedDog = dog;
                break;
            }
        }

        if (selectedDog != null) {
            return adoptDog(selectedDog);
        } else {
            System.out.println("Dog with name '" + dogName + "' is not available for adoption.");
            return false;
        }
    }

    public String toString() {
        return firstName + " " + lastName + " (" + document + "), " + age + " years old\n" +
               "Dog: " + (adoptedDog != null ? adoptedDog.toString() : "None");
    }
}
