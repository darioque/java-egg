package entities;

public class Perro {
    private String name;
    private String raza;
    private Integer age;
    private Double size;


    public Perro() {
    }

    public Perro(String name, String raza, Integer age, Double size) {
        this.name = name;
        this.raza = raza;
        this.age = age;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Perro [name=" + name + ", raza=" + raza + ", age=" + age + ", size=" + size + "]";
    }

    



}
