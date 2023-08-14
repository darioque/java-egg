import entities.Perro;
import entities.Persona;

public class App {
    public static void main(String[] args) {
        ej1();
    }

    public static void ej1() {
        Perro p1 = new Perro("Firulais", "Pitbull", 5, 20.4);
        Perro p2 = new Perro("Firulais", "Pitbull", 5, 20.0);

        Persona persona = new Persona("Juan", "Perez", 20, 41410661, p1);
        Persona persona2 = new Persona("Juan", "Perez", 20, 41410662, p2);

        System.out.println(persona);
        System.out.println(persona2);
    }


}
