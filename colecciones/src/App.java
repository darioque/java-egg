import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import entities.Alumno;
import services.AlumnoService;
import services.PeliculaService;
import services.ProductoService;

public class App {
    public static void main(String[] args) throws Exception {

        // ej1y2();
        // ej3();
        // ej4();
        // ej5();
        ej6();

    }

    public static void ej1y2() {
        ArrayList<String> razas = new ArrayList<String>();

        while (true) {
            System.out.println("Ingrese una raza de perro: ");
            String raza = System.console().readLine();
            razas.add(raza);
            System.out.println("Desea ingresar otra raza? (s/n)");
            String respuesta = System.console().readLine();
            if (respuesta.equals("n")) {
                break;
            }
        }

        System.out.println(razas);

        System.out.println("Ingrese una raza a buscar");
        String razaBuscada = System.console().readLine();
        Iterator<String> it = razas.iterator();

        int tamano = razas.size();

        while (it.hasNext()) {
            if (it.next().equals(razaBuscada)) {
                System.out.println("La raza " + razaBuscada + " se encuentra en la lista y será eliminada");
                razas.remove(razaBuscada);
                break;
            }
        }

        if (tamano == razas.size()) {
            System.out.println("La raza " + razaBuscada + " no se encuentra en la lista");
        }

        // mostrar la lista ordenada
        Collections.sort(razas);
        System.out.println(razas);
    }

    public static void ej3() {
        AlumnoService sa = new AlumnoService();
        sa.createAlumnos();
        sa.showAlumnos();

        System.out.println("Ingrese el nombre del alumno a buscar");
        String nombre = System.console().readLine();
        for (Alumno alumno : sa.alumnos) {
            if (alumno.getName().equals(nombre)) {
                System.out.println("La nota final de " + nombre + " es " + sa.notaFinal(alumno));
            }
        }
    }

    public static void ej4() {
        PeliculaService ps = new PeliculaService();
        ps.crearPelicula();
        ps.mostrarPeliculas();
        ps.mostrarPeliculas(1.0);
        ps.ordenarPeliculasMayorAMenor();
        ps.ordenarPeliculasMenorAMayor();
        ps.ordenarPeliculasPorTitulo();
        ps.ordenarPeliculasPorDirector();
    }

    public static void ej5() {
        HashSet<String> paises = new HashSet<String>();

        while (true) {
            System.out.println("Ingrese un país");
            String pais = System.console().readLine();
            paises.add(pais);
            System.out.println("Desea ingresar otro país? (s/n)");
            String respuesta = System.console().readLine();
            if (respuesta.equals("n")) {
                break;
            }
        }

        System.out.println(paises);

        // ordenar el conjunto alfabeticamente y mostrarlo
        ArrayList<String> paisesOrdenados = new ArrayList<String>(paises);

        Collections.sort(paisesOrdenados);
        
        System.out.println(paisesOrdenados);

        System.out.println("Ingrese un país");
        String pais = System.console().readLine();
        
        Iterator<String> it = paises.iterator();

        int tamano = paises.size();

        while (it.hasNext()) {
            if (it.next().equals(pais)) {
                System.out.println("El país " + pais + " se encuentra en el conjunto y será eliminado");
                it.remove();
                break;
            }
        }

        if (tamano == paises.size()) {
            System.out.println("El país " + pais + " no se encuentra en el conjunto");
        }

    }

    public static void ej6() {
        ProductoService ps = new ProductoService();

        ps.menu();
    }

}
