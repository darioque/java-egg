package services;

import java.util.ArrayList;
import entities.Pelicula;

public class PeliculaService {

    ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
    
    public void crearPelicula() {

        while (true) {
            Pelicula pelicula = new Pelicula();
    
            System.out.println("Ingrese el titulo de la pelicula");
            pelicula.setTitulo(System.console().readLine());
    
            System.out.println("Ingrese el director de la pelicula");
            pelicula.setDirector(System.console().readLine());
    
            System.out.println("Ingrese la duracion de la pelicula");
            pelicula.setDuracion(Double.parseDouble(System.console().readLine()));

            peliculas.add(pelicula);

            System.out.println("Desea ingresar otra pelicula? (s/n)");
            String respuesta = System.console().readLine();
            if (respuesta.equals("n")) {
                break;
            }
        }
    }

    public void mostrarPeliculas() {
        System.out.println(peliculas);
    }

    public void mostrarPeliculas(Double duracionMinima) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() >= duracionMinima) {
                System.out.println(pelicula);
            }
        }
    }
    
    public void mostrarPeliculasFor(Double duracionMinima) {

        peliculas.forEach(pelicula -> {
            if (pelicula.getDuracion() >= duracionMinima) {
                System.out.println(pelicula);
            }
        });
    }

    public void ordenarPeliculasMenorAMayor() {
        peliculas.sort(Pelicula.compararDuracion);
        mostrarPeliculas();
    }

    public void ordenarPeliculasMayorAMenor() {
        peliculas.sort(Pelicula.compararDuracion.reversed());
        mostrarPeliculas();
    }

    public void ordenarPeliculasPorTitulo() {
        peliculas.sort(Pelicula.compararTitulo);
        mostrarPeliculas();
    }

    public void ordenarPeliculasPorDirector() {
        peliculas.sort(Pelicula.compararDirector);
        mostrarPeliculas();
    }
}
