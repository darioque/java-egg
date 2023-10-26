package com.jpa.services;

import org.checkerframework.checker.units.qual.A;

import com.jpa.entities.Author;
import com.jpa.entities.Publisher;

public class Menu {

    private int opcion;

    private BookService bookService = new BookService();
    private AuthorService authorService = new AuthorService();
    private PublisherService publisherService = new PublisherService();

    public void start() throws Exception {
        do {
            System.out.println("Menú de opciones");
            System.out.println("1. Añadir autor");
            System.out.println("2. Añadir editorial");
            System.out.println("3. Añadir libro");
            System.out.println("4. Modificar libro");
            System.out.println("5. Eliminar libro");
            System.out.println("6. Eliminar editorial");
            System.out.println("7. Eliminar autor");
            System.out.println("8. Mostrar autores");
            System.out.println("9. Mostrar editoriales");
            System.out.println("10. Mostrar libros");
            System.out.println("11. Buscar autor por id");
            System.out.println("12. Buscar editorial por id");
            System.out.println("13. Buscar libro por isbn");
            System.out.println("14. Buscar libro por titulo");
            System.out.println("15. Buscar libro por autor");
            System.out.println("16. Buscar libro por editorial");
            System.out.println("17. Buscar libro por año");
            System.out.println("18. Buscar autor por nombre");
            System.out.println("19. Salir");
            System.out.println("Introduce una opción: ");

            opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {
                case 1:
                    System.out.println("Introduce el nombre del autor: ");
                    String name = System.console().readLine();
                    try {
                        authorService.saveAuthor(name);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Introduce el nombre de la editorial: ");
                    String namePublisher = System.console().readLine();
                    try {
                        publisherService.savePublisher(namePublisher);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Introduce el isbn del libro: ");
                    long isbn = Long.parseLong(System.console().readLine());
                    System.out.println("Introduce el título del libro: ");
                    String title = System.console().readLine();
                    System.out.println("Introduce el año del libro: ");
                    int year = Integer.parseInt(System.console().readLine());
                    System.out.println("Introduce el número de ejemplares del libro: ");
                    int copies = Integer.parseInt(System.console().readLine());
                    System.out.println("Introduce el nombre del autor del libro: ");
                    String nameAuthor = System.console().readLine();
                    Author author = authorService.saveAuthor(nameAuthor);
                    System.out.println("Introduce el nombre de la editorial del libro: ");
                    namePublisher = System.console().readLine();
                    Publisher publisher = publisherService.savePublisher(namePublisher);
                    try {
                        bookService.saveBook(isbn, title, year, copies, author, publisher);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Introduce el isbn del libro: ");
                    long isbn2 = Long.parseLong(System.console().readLine());
                    System.out.println("Introduce el título del libro: ");
                    String title2 = System.console().readLine();
                    System.out.println("Introduce el año del libro: ");
                    int year2 = Integer.parseInt(System.console().readLine());
                    System.out.println("Introduce el número de ejemplares del libro: ");
                    int copies2 = Integer.parseInt(System.console().readLine());
                    System.out.println("Introduce el nombre del autor del libro: ");
                    String nameAuthor2 = System.console().readLine();
                    System.out.println("Introduce el nombre de la editorial del libro: ");
                    String namePublisher2 = System.console().readLine();
                    try {
                        bookService.modifyBook(isbn2, title2, year2, copies2, authorService.saveAuthor(nameAuthor2), publisherService.savePublisher(namePublisher2));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Introduce el isbn del libro: ");
                    long isbn3 = Long.parseLong(System.console().readLine());
                    try {
                        bookService.removeBook(isbn3);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("Introduce el nombre de la editorial: ");
                    String namePublisher3 = System.console().readLine();
                    Integer publisherId = publisherService.findPublisherByName(namePublisher3).getId();
                    try {
                        publisherService.removePublisher(publisherId);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    System.out.println("Introduce el nombre del autor: ");
                    String nameAuthor3 = System.console().readLine();
                    Integer authorId = authorService.findAuthorByName(nameAuthor3).getId();
                    try {
                        authorService.removeAuthor(authorId);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 8:
                    try {
                        authorService.showAuthors();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 9:
                    try {
                        publisherService.showPublishers();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 10:
                    try {
                        bookService.showBooks();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 11:
                    System.out.println("Introduce el id del autor: ");
                    Integer authorId2 = Integer.parseInt(System.console().readLine());
                    try {
                        Author author1 = authorService.findAuthorById(authorId2);
                        System.out.println(author1.getName());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 12:
                    System.out.println("Introduce el id de la editorial: ");
                    Integer publisherId2 = Integer.parseInt(System.console().readLine());
                    try {
                        publisherService.findPublisherById(publisherId2);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 13:
                    System.out.println("Introduce el isbn del libro: ");
                    long isbn4 = Long.parseLong(System.console().readLine());
                    try {
                        bookService.findBookByIsbn(isbn4);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 14:
                    System.out.println("Introduce el título del libro: ");
                    String title3 = System.console().readLine();
                    try {
                        bookService.findBookByTitle(title3);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 15:
                    System.out.println("Introduce el nombre del autor: ");
                    String nameAuthor4 = System.console().readLine();
                    try {
                        bookService.findBooksByAuthor(nameAuthor4);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 16:
                    System.out.println("Introduce el nombre de la editorial: ");
                    String namePublisher4 = System.console().readLine();
                    try {
                        bookService.findBooksByPublisher(namePublisher4);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 17:
                    System.out.println("Introduce el año del libro: ");
                    int year3 = Integer.parseInt(System.console().readLine());
                    try {
                        bookService.findBooksByYear(year3);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 18:
                    System.out.println("Introduce el nombre del autor: ");
                    String nameAuthor5 = System.console().readLine();
                    try {
                        authorService.findAuthorByName(nameAuthor5);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 19:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion < 19);
    }
}
