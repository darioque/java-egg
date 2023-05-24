import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        // ej01(leer);
        // ej02(leer);
        // ej03(leer);
        // ej04(leer);
        // ej05(leer);
        // ej06(leer);
        // ej07(leer);
        // ej08(leer);
        // ej09(leer);
        // ej10(leer);
        // ej11(leer);
        ej12(leer);
        leer.close();

    }

    public static void ejemplo() {
        System.out.println("Hello, World!");

        String name = "Dario";
        String lastName = "Skidelsky";
        System.out.println("My name is " + name + " " + lastName);

        Scanner leer = new Scanner(System.in);

        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos numeros son mayores a 25");
        } else if (num1 > 25) {
            System.out.println("El primer numero es mayor a 25");
        } else if (num2 > 25) {
            System.out.println("El segundo numero es mayor a 25");
        } else {
            System.out.println("Ninguno de los numeros es mayor a 25");
        }

        var print = "";
        for (int i = 1; i < 5; i++) {
            num1 = leer.nextInt();
            print = print + num1;

            for (int j = 0; j < num1; j++) {
                print = print + "*";
            }
            print = print + "\n";
        }
        leer.close();
        System.out.println("\n" + print);
    }

    public static void ej01(Scanner leer) {
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println(suma);

    }

    public static void ej02(Scanner leer) {
        String name = leer.nextLine();
        System.out.println(name);
    }

    // Escribir un programa que pida una frase y la meustre toda en mayusculas y
    // despues todas en minusculas, utilizando toUpperCase y toLowerCase.
    public static void ej03(Scanner leer) {
        String frase = leer.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }

    // Dada una cantidad de grados centígrados se debe mostrar
    // su equivalente en grados Fahrenheit.
    // La fórmula correspondiente es: F = 32 + (9 * C / 5).
    public static void ej04(Scanner leer) {
        int gradosC = leer.nextInt();
        int gradosF = 32 + (9 * gradosC / 5);
        System.out.println(gradosF);
    }

    // Escribir un programa que lea un numero entero por teclado y muestra
    // por pantalla el doble, el triple y la raiz cuadrada de ese numero, utilizando
    // Math.sqrt().
    public static void ej05(Scanner leer) {
        int num = leer.nextInt();
        System.out.println(num * 2);
        System.out.println(num * 3);
        System.out.println(Math.sqrt(num));
    }

    // Crear un programa que dado un numero determine si es
    // par o impar.
    public static void ej06(Scanner leer) {
        int num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }

    // Crear un programa que pida una frase y si esa frase
    // es igual a "eureka" el pgorama pondrá un mensaje de Correcto
    // sino mostrará un mensaje de INncorrecto. Nota: investigar la función
    // equals() en Java.
    public static void ej07(Scanner leer) {
        String frase = leer.nextLine();
        if (frase.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }

    //     Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
    // usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
    // pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
    // Nota: investigar la función Lenght() en Java.
    public static void ej08(Scanner leer) {
        String frase = leer.nextLine();
        if (frase.length() == 8) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
    //     Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
    // es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
    // diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
    // la función Substring y equals() de Java.
    public static void ej09(Scanner leer) {
        String frase = leer.nextLine();
        if (frase.substring(0, 1).equals("A")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }

    // Escriba un programa en el cual se ingrese un valor limite
    // positivo, y a continuacion solicite numeros al usuario hasta que la suma
    // de los numeros introducidos supere el limite inicial.

    public static void ej10(Scanner leer) {
        int limite = leer.nextInt();
        int suma = 0;
        int num = 0;
        while (suma < limite) {
            num = leer.nextInt();
            suma = suma + num;
        }
        System.out.println("La suma es: " + suma);
    }

    // Realizar un programa que pida dos numeros enteros positivos
    // por teclado y muestre por pantalla el siguiente menú
    // 1. Sumar 2. Restar 3. Multiplicar 4. Dividir 5. Salir Elija opción:
    // El usuario deberá elegir una opción y el programa deberá mostrar el resultado
    // por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que
    // se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5,
    // en vez de salir del programa directamente, se debe mostrar el siguiente mensaje
    // de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el usuario
    // selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

    public static void ej11(Scanner leer) {
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Salir \nElija opción:");
            opcion = leer.nextInt();
            leer.nextLine(); // Limpio el buffer
            switch (opcion) {
                case 1:
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    System.out.println(num1 / num2);
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    String confirmacion = leer.nextLine();
                    if (confirmacion.equalsIgnoreCase("S")) {
                        opcion = 5;
                    } else {
                        opcion = 0;
                    }
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
    }

    // Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
    // dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
    // fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
    // X y el último tiene que ser una O.
    // Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial
    // “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que
    // no respete el formato se considera incorrecta.
    // Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
    // incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
    // funciones de Java Substring(), Length(), equals().
    public static void ej12(Scanner leer) {
        String cadena = leer.nextLine();
        int correctas = 0;
        int incorrectas = 0;
        while (!cadena.equals("&&&&&")) {
            if (cadena.length() == 5 && cadena.substring(0, 1).equals("X") && cadena.substring(4, 5).equals("O")) {
                correctas++;
            } else {
                incorrectas++;
            }
            cadena = leer.nextLine();
        }
        System.out.println("Correctas: " + correctas);
        System.out.println("Incorrectas: " + incorrectas);
    }



}
