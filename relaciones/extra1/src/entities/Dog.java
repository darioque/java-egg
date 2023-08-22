package entities;
public class Dog {
    private String name;
    private String breed;
    private int age;
    private String size;
    private boolean adopted;

    public Dog(String name, String breed, int age, String size) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.size = size;
        this.adopted = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAdopted(boolean adopted) {
        this.adopted = adopted;
    }

    public void adopt() {
        adopted = true;
    }

    public boolean isAdopted() {
        return adopted;
    }

    public String toString() {
        return name + " (" + breed + "), " + age + " years old, " + size + " size";
    }
}

