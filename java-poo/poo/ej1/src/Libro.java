import java.util.Scanner;

class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro() {
        // Constructor vacío
    }

    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public void cargarLibro() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de ISBN: ");
        ISBN = scanner.nextLine();

        System.out.print("Ingrese el título del libro: ");
        titulo = scanner.nextLine();

        System.out.print("Ingrese el autor del libro: ");
        autor = scanner.nextLine();

        System.out.print("Ingrese el número de páginas: ");
        numPaginas = scanner.nextInt();
    }

    public void mostrarInformacion() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numPaginas);
    }
}