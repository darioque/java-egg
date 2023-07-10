public class App {
    public static void main(String[] args) {

        ej1();
        ej2();

    }

    public static void ej1() {
        Libro libro = new Libro();
        libro.cargarLibro();
        System.out.println("--- Información del libro ---");
        libro.mostrarInformacion();
    }

    public static void ej2() {
        Circunferencia circunferencia = new Circunferencia(0.0);
        circunferencia.crearCircunferencia();

        System.out.println("--- Información de la circunferencia ---");
        System.out.println("Radio: " + circunferencia.getRadio());
        System.out.println("Área: " + circunferencia.area());
        System.out.println("Perímetro: " + circunferencia.perimetro());
    }

    // public static void ej3() {
    //     Rectangulo rectangulo = new Rectangulo(0.0, 0.0);
    //     rectangulo.crearRectangulo();

    //     System.out.println("--- Información del rectángulo ---");
    //     System.out.println("Base: " + rectangulo.getBase());
    //     System.out.println("Altura: " + rectangulo.getAltura());
    //     System.out.println("Área: " + rectangulo.area());
    //     System.out.println("Perímetro: " + rectangulo.perimetro());
    // }

    
}