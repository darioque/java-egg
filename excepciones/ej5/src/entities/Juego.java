package entities;

import java.util.Random;
import java.util.Scanner;

// Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
// debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
// ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
// número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
// consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
// ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
// controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
// carácter fallido como un intento.

public class Juego {

    private Random random = new Random();

    private Integer numeroAleatorio = random.nextInt(500) + 1;

    private Integer intentos = 0;

    private Integer valor = 0;

    public void empezarJuego() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        do {
            try {
                System.out.println("Ingresa un numero");
                valor = scanner.nextInt();
                if (valor > numeroAleatorio) {
                    System.out.println("El numero a adivinar es menor");
                } else if (valor < numeroAleatorio) {
                    System.out.println("El numero a adivinar es mayor");
                }
                
                System.out.println(numeroAleatorio);
                System.out.println(valor == numeroAleatorio);
            } catch (NumberFormatException e) {
                System.out.println(e);
            } finally {
                intentos = intentos + 1;
            }

        } while (valor != numeroAleatorio);

        System.out.println("Correcto! El numero era " + numeroAleatorio + " y utilizaste " + intentos + " intentos");


    }

}
