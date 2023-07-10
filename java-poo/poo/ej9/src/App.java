import services.MatematicaService;
import java.util.Scanner;
import services.RaicesService;
import entities.Matematica;
import entities.Raices;
import entities.NIF;
import services.NIFService;

import services.AhorcadoService;

public class App {
    public static void main(String[] args) {
        // ej8();
        // ej9();
        // extra_3();
        // extra_4();
        extra_5();
    }

    public static void ej9() {
        double numero1 = Math.random() * 10;
        double numero2 = Math.random() * 10;

        MatematicaService servicioMatematica = new MatematicaService();

        Matematica m1 = servicioMatematica.crearMatematica(numero1, numero2);

        double potencia = servicioMatematica.calcularPotencia(m1);
        double raiz = servicioMatematica.calculaRaiz(m1);

        System.out.println("Numero 1: " + numero1);
        System.out.println("Numero 2: " + numero2);
        System.out.println("Potencia: " + potencia);
        System.out.println("Raiz: " + raiz);
    }

    public static void extra_3() {
        RaicesService sr = new RaicesService();

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor de a: ");
        double a = sc.nextDouble();

        System.out.println("Ingrese el valor de b: ");
        double b = sc.nextDouble();

        System.out.println("Ingrese el valor de c: ");
        double c = sc.nextDouble();

        sc.close();

        Raices raiz = sr.crearRaices(a, b, c);

        sr.calcular(raiz);

    }

    public static void extra_4() {
        NIFService ns = new NIFService();

        NIF nif = ns.crearNIF();

        ns.mostrar(nif);
    }

    public static void extra_5() {
        AhorcadoService as = new AhorcadoService();

        as.juego();
    }
}
