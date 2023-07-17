import services.MatematicaService;
import java.util.Scanner;
import services.RaicesService;
import services.RutinaService;
import entities.Cliente;
import entities.Matematica;
import entities.Raices;
import entities.Rutina;
import entities.NIF;
import services.NIFService;

import services.AhorcadoService;
import services.ClienteService;

public class App {
    public static void main(String[] args) {
        // ej8();
        // ej9();
        // extra_3();
        // extra_4();
        // extra_5();
        grupal();
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

    public static void grupal() {
        // crear cinco clientes con datos ficticios
        ClienteService cs = new ClienteService();
        Cliente c1 = cs.crearCliente(0, null, 0, 0, 0, null);
        Cliente c2 = cs.crearCliente(0, null, 0, 0, 0, null);
        Cliente c3 = cs.crearCliente(0, null, 0, 0, 0, null);
        Cliente c4 = cs.crearCliente(0, null, 0, 0, 0, null);
        Cliente c5 = cs.crearCliente(0, null, 0, 0, 0, null);

        // registrar los clientes
        cs.registrarCliente(c1);
        cs.registrarCliente(c2);
        cs.registrarCliente(c3);
        cs.registrarCliente(c4);
        cs.registrarCliente(c5);

        // crear cinco rutinas con datos ficticios
        RutinaService rs = new RutinaService();
        Rutina r1 = rs.crearRutina(0, null, 0, 0, null);
        Rutina r2 = rs.crearRutina(0, null, 0, 0, null);
        Rutina r3 = rs.crearRutina(0, null, 0, 0, null);
        Rutina r4 = rs.crearRutina(0, null, 0, 0, null);
        Rutina r5 = rs.crearRutina(0, null, 0, 0, null);

        // registrar las rutinas
        rs.registrarRutina(r1);
        rs.registrarRutina(r2);
        rs.registrarRutina(r3);
        rs.registrarRutina(r4);
        rs.registrarRutina(r5);


        // mostrar los clientes
        cs.mostrarClientes();

        // mostrar las rutinas
        rs.mostrarRutinas();

        // actualizar algun cliente y mostrar la lista modificada
        cs.actualizarCliente(0, null, 0, 0, 0, "hola");
        cs.mostrarClientes();

        // actualizar alguna rutina y mostrar la lista modificada
        rs.actualizarRutina(0, null, 0, 0, "hola");
        rs.mostrarRutinas();

        // eliminar algun cliente y mostrar la lista modificada
        cs.eliminarCliente(0);
        cs.obtenerClientes();

        // eliminar alguna rutina y mostrar la lista modificada
        rs.eliminarRutina(0);
        rs.obtenerRutinas();
    }
}
