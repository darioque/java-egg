import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import entities.Alumno;
import services.AlumnoService;

public class App {
    public static void main(String[] args) throws Exception {

        // ej1y2();
        ej3();

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
}
