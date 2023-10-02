import entities.PersonaService;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        PersonaService ps = new PersonaService();

        System.out.println(ps.getPersonas());

        ps.tirarExcepcion();

    }
}
