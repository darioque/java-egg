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
        // ej12(leer);
        // ej13(leer);
        // ej14(leer, 500, "dolares");
        // int[][] matrix = new int[3][3];
        // fillMatrix(matrix);
        // showMatrix(matrix);
        // System.out.println();
        // int[][] traspuesta = ej18(matrix);
        // showMatrix(traspuesta);
        // System.out.println();
        // ej19();
        ej20(leer);

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

    // Realizar un programa que solo permita introducir solo frases o palabras de 8
    // de largo. Si el
    // usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un
    // mensaje por
    // pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
    // “INCORRECTO”.
    // Nota: investigar la función Lenght() en Java.
    public static void ej08(Scanner leer) {
        String frase = leer.nextLine();
        if (frase.length() == 8) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }

    // Escriba un programa que pida una frase o palabra y valide si la primera letra
    // de esa frase
    // es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje
    // por pantalla que
    // diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
    // investigar
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
    // se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción
    // 5,
    // en vez de salir del programa directamente, se debe mostrar el siguiente
    // mensaje
    // de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el
    // usuario
    // selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a
    // mostrar el menú.

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

    // Realizar un programa que simule el funcionamiento de un dispositivo RS232,
    // este tipo de
    // dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con
    // un formato
    // fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
    // carácter tiene que ser
    // X y el último tiene que ser una O.
    // Las secuencias leídas que respeten el formato se consideran correctas, la
    // secuencia especial
    // “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
    // distinta de FDE, que
    // no respete el formato se considera incorrecta.
    // Al finalizar el proceso, se imprime un informe indicando la cantidad de
    // lecturas correctas e
    // incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se
    // utilizan las siguientes
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

    // dibujar un cuadrado de N elementos por lado utilizando el
    // caracter "*" . Por ejemplo, si el cuadrado tiene 4 elementos por lado se
    // deberá dibujar lo siguiente:
    // * * * *
    // * *
    // * *
    // * * * *

    public static void ej13(Scanner leer) {
        int n = leer.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < n - 2; i++) {
            System.out.print("* ");
            for (int j = 0; j < n - 2; j++) {
                System.out.print("  ");
            }
            System.out.println("* ");
        }
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
    }

    // Crea una aplicacion que a través de una funcion nos convierta
    // una cantidad de euros introducida por teclado a otra moneda,
    // estas pueden ser a dolares, yenes o libras. La función tendrá
    // como parámetros, la cantidad de euros y la moneda a convertir
    // que será una cadena, este no devolverá ningun valor y mostrara
    // un mensaje indicando el cambio (void)

    public static void ej14(Scanner leer, int cantidad, String moneda) {
        switch (moneda.toLowerCase()) {
            case "dolares":
                System.out.println(cantidad * 1.28611);
                break;
            case "yenes":
                System.out.println(cantidad * 129.852);
                break;
            case "libras":
                System.out.println(cantidad * 0.86);
                break;
            default:
                System.out.println("Moneda incorrecta");
                break;
        }
    }

    // Realizar un algoitmo que rellene un vector con los 100
    // primeros numeros enteros y los muestre por pantalla en orden
    // descendente.
    public static void ej15(Scanner leer) {
        int[] vector = new int[100];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;
        }
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.println(vector[i]);
        }
    }

    // Realizar un algoritmo que rellene un vector de tamaño
    // N con valores aleatorios y le pida al usuario un numero a buscar
    // en el vector. El programa mostrará donde se encuentra el numero
    // y si se encuentra repetido.
    public static void ej16(Scanner leer) {
        int[] vector = new int[100];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100);
        }
        int num = leer.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                System.out.println("El numero se encuentra en la posicion " + i);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("El numero no se encuentra en el vector");
        }
    }

    // Recorrer un vector de N eneteros contabilizando cuantos numeros
    // de un digito hay, cuantos de dos digitos, etc. (hasta 5 digitos).
    public static void ej17(Scanner leer) {
        int[] vector = new int[100];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100000);
        }
        int[] contadores = new int[5];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < 10) {
                contadores[0]++;
            } else if (vector[i] < 100) {
                contadores[1]++;
            } else if (vector[i] < 1000) {
                contadores[2]++;
            } else if (vector[i] < 10000) {
                contadores[3]++;
            } else {
                contadores[4]++;
            }
        }
        for (int i = 0; i < contadores.length; i++) {
            System.out.println("Cantidad de numeros de " + (i + 1) + " digito: " + contadores[i]);
        }
    }

    // Realizar un programa que rellene un matriz de 4 x 4 de valores
    // aleatorios y muestre la traspuesta de la matriz. La traspuesta de
    // una matriz es intercambiar las filas por las columnas.
    public static int[][] ej18(int[][] matrix) {
        int[][] traspuesta = new int[matrix.length][matrix.length];

        for (int i = 0; i < traspuesta.length; i++) {
            for (int j = 0; j < traspuesta[i].length; j++) {
                traspuesta[i][j] = matrix[j][i];
            }
        }
        return traspuesta;
    }

    public static int[][] fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        return matrix;
    }


    public static void ej19() {
        System.out.println("Comprobar si una matriz es anti simetrica");
        int[][] matrix = new int[3][3];

        fillMatrix(matrix);
        

        int[][] traspuesta = ej18(matrix);

        boolean antiSimetrica = true;

        // force matrix to be antisimetric to test
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix.length; j++) {
        //         matrix[i][j] = traspuesta[i][j] * - 1;
        //     }
        // }
        showMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != traspuesta[i][j] * -1) {
                    antiSimetrica = false;
                    break;
                }
            }
        }
        System.out.println();
        showMatrix(traspuesta);

        System.out.println();
        if (antiSimetrica) {
            System.out.println("Es antisimetrica");
        } else {
            System.out.println("No es antisimetrica");
        }
    }

    public static void ej20(Scanner leer) {
        // constants for matrix
        final int MATRIX_SIZE = 3;
        final int MIN_NUMBER = 1;
        final int MAX_NUMBER = 9;

        int[][] matrix = new int[MATRIX_SIZE][MATRIX_SIZE];
        int[] sumas = new int[2 * MATRIX_SIZE + 2];
        boolean magico = true;

        // Fill matrix and calculate sums
        fillMatrix(matrix, leer, MIN_NUMBER, MAX_NUMBER);
        calculateSums(matrix, sumas);

        // Check if all sums are equal
        for (int i = 0; i < sumas.length - 1; i++) {
            if (sumas[i] != sumas[i + 1]) {
                magico = false;
                break;
            }
        }

        showMatrix(matrix);
        System.out.println();
        if (magico) {
            System.out.println("Es mágico");
        } else {
            System.out.println("No es mágico");
        }
    }

    public static void fillMatrix(int[][] matrix, Scanner leer, int minNumber, int maxNumber) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                do {
                    System.out.println("Ingrese un número entre " + minNumber + " y " + maxNumber);
                    matrix[i][j] = leer.nextInt();
                } while (matrix[i][j] < minNumber || matrix[i][j] > maxNumber);
            }
        }
    }

    public static void calculateSums(int[][] matrix, int[] sumas) {
        int size = matrix.length;

        for (int i = 0; i < size; i++) {
            int rowSum = 0;
            int colSum = 0;
            sumas[i] = 0; // Rows sum
            sumas[i + size] = 0; // Columns sum

            for (int j = 0; j < size; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }

            sumas[i] = rowSum;
            sumas[i + size] = colSum;
        }

        int diagonal1Sum = 0;
        int diagonal2Sum = 0;

        for (int i = 0; i < size; i++) {
            diagonal1Sum += matrix[i][i];
            diagonal2Sum += matrix[i][size - 1 - i];
        }

        sumas[2 * size] = diagonal1Sum; // Main diagonal sum
        sumas[2 * size + 1] = diagonal2Sum; // Secondary diagonal sum
    }

    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    







}
