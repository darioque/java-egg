package entities;

public class Persona {
    
    private String name;
    private String lastName;
    private int age;
    private long dni;
    private Perro perro;

    public Persona() {

    }

    public Persona(String name, String lastName, int age, long dni, Perro perro) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.dni = dni;
        this.perro = perro;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona [name=" + name + ", lastName=" + lastName + ", age=" + age + ", dni=" + dni + ", perro=" + perro
                + "]";
    }

    

}
