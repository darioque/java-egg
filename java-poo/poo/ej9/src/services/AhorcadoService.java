package services;

import java.util.Scanner;

import entities.Ahorcado;

public class AhorcadoService {
    Scanner read = new Scanner(System.in);



    private Ahorcado ahorcado = new Ahorcado();
    
    // public Ahorcado crearAhorcado(String[] palabra, int cantLetras, int intentos) {
    //     return new Ahorcado(palabra, cantLetras, intentos);
    // }

    // public Ahorcado crearAhorcado() {
    //     return new Ahorcado();
    // }

    public void crearJuego() {

        System.out.println("Ingrese la palabra a adivinar: ");
        String palabra = read.nextLine();

        System.out.println("Ingrese la cantidad de intentos");
        int intentos = read.nextInt();
        read.nextLine(); // Consume the newline character

        String[] wordArray = new String[palabra.length()];

        for (int i = 0; i < wordArray.length; i++) {
            wordArray[i] = palabra.substring(i, i + 1);
        }

        ahorcado.setPalabra(wordArray);
        ahorcado.setIntentos(intentos);
        ahorcado.setCantLetras(0);

    }

    public void longitud() {
        System.out.println("La palabra tiene " + ahorcado.getPalabra().length + " letras");
    }

    public void intentos() {
        System.out.println("Le quedan " + ahorcado.getIntentos() + " intentos");
    }

    public void juego() {
        crearJuego();
        longitud();
        intentos();

        while (ahorcado.getIntentos() > 0 && ahorcado.getCantLetras() < ahorcado.getPalabra().length) {
            System.out.println("Ingrese una letra: ");  
            String letra = read.nextLine();
            encontradas(letra);
            intentos();
        }

        read.close();
    }

    public Boolean encontradas(String letra) {
        Boolean encontrada = false;

        for (int i = 0; i < ahorcado.getPalabra().length; i++) {
            if (ahorcado.getPalabra()[i].equals(letra)) { // Use equals() for string comparison
                encontrada = true;
            }
        }

        if (encontrada) {
            ahorcado.setCantLetras(ahorcado.getCantLetras() + 1);
            System.out.println("La letra se encuentra en la palabra");
        } else {
            ahorcado.setIntentos(ahorcado.getIntentos() - 1);
            System.out.println("La letra no se encuentra en la palabra");
        }

        System.out.println("Letras encontradas: " + ahorcado.getCantLetras());
        System.out.println("Le faltan " + (ahorcado.getPalabra().length - ahorcado.getCantLetras()) + " letras");

        return encontrada;
    }


}
