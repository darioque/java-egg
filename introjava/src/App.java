import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        // ej01(read);
        // ej02(read);
        // ej03(read);
        // ej04(read);
        // ej05(read);
        // ej06(read);
        // ej07(read);
        // ej08(read);
        // ej09(read);
        // ej10(read);
        // ej11(read);
        // ej12(read);
        // ej13(read);
        // ej14(read, 500, "dolares");
        // int[][] matrix = new int[3][3];
        // fillMatrix(matrix);
        // showMatrix(matrix);
        // System.out.println();
        // int[][] traspuesta = ej18(matrix);
        // showMatrix(traspuesta);
        // System.out.println();
        // ej19();
        // ej20(read);
        // ej21(read);
        // extra_1(read);
        // extra_2();
        // extra_3(read);
        // extra_5(read);
        // extra_6(read);
        // extra_7(read);
        // extra_7B(read);
        // extra_8(read);
        // extra_9(read);
        // extra_10(read);
        // extra_11(read);
        // extra_12();
        extra_23(read);
        read.close();

    }

    public static void ejemplo() {
        System.out.println("Hello, World!");

        String name = "Dario";
        String lastName = "Skidelsky";
        System.out.println("My name is " + name + " " + lastName);

        Scanner read = new Scanner(System.in);

        int num1 = read.nextInt();
        int num2 = read.nextInt();

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
            num1 = read.nextInt();
            print = print + num1;

            for (int j = 0; j < num1; j++) {
                print = print + "*";
            }
            print = print + "\n";
        }
        read.close();
        System.out.println("\n" + print);
    }

    public static void ej01(Scanner read) {
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        int suma = num1 + num2;
        System.out.println(suma);

    }

    public static void ej02(Scanner read) {
        String name = read.nextLine();
        System.out.println(name);
    }

    // Escribir un programa que pida una frase y la meustre toda en mayusculas y
    // despues todas en minusculas, utilizando toUpperCase y toLowerCase.
    public static void ej03(Scanner read) {
        String frase = read.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }

    // Dada una cantidad de grados centígrados se debe mostrar
    // su equivalente en grados Fahrenheit.
    // La fórmula correspondiente es: F = 32 + (9 * C / 5).
    public static void ej04(Scanner read) {
        int gradosC = read.nextInt();
        int gradosF = 32 + (9 * gradosC / 5);
        System.out.println(gradosF);
    }

    // Escribir un programa que lea un numero entero por teclado y muestra
    // por pantalla el doble, el triple y la raiz cuadrada de ese numero, utilizando
    // Math.sqrt().
    public static void ej05(Scanner read) {
        int num = read.nextInt();
        System.out.println(num * 2);
        System.out.println(num * 3);
        System.out.println(Math.sqrt(num));
    }

    // Crear un programa que dado un numero determine si es
    // par o impar.
    public static void ej06(Scanner read) {
        int num = read.nextInt();
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
    public static void ej07(Scanner read) {
        String frase = read.nextLine();
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
    public static void ej08(Scanner read) {
        String frase = read.nextLine();
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
    public static void ej09(Scanner read) {
        String frase = read.nextLine();
        if (frase.substring(0, 1).equals("A")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }

    // Escriba un programa en el cual se ingrese un valor limite
    // positivo, y a continuacion solicite numeros al usuario hasta que la suma
    // de los numeros introducidos supere el limite inicial.

    public static void ej10(Scanner read) {
        int limite = read.nextInt();
        int suma = 0;
        int num = 0;
        while (suma < limite) {
            num = read.nextInt();
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

    public static void ej11(Scanner read) {
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Salir \nElija opción:");
            opcion = read.nextInt();
            read.nextLine(); // Limpio el buffer
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
                    String confirmacion = read.nextLine();
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
    public static void ej12(Scanner read) {
        String cadena = read.nextLine();
        int correctas = 0;
        int incorrectas = 0;
        while (!cadena.equals("&&&&&")) {
            if (cadena.length() == 5 && cadena.substring(0, 1).equals("X") && cadena.substring(4, 5).equals("O")) {
                correctas++;
            } else {
                incorrectas++;
            }
            cadena = read.nextLine();
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

    public static void ej13(Scanner read) {
        int n = read.nextInt();
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

    public static void ej14(Scanner read, int cantidad, String moneda) {
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
    public static void ej15(Scanner read) {
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
    public static void ej16(Scanner read) {
        int[] vector = new int[100];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100);
        }
        int num = read.nextInt();
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
    public static void ej17(Scanner read) {
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
        // for (int j = 0; j < matrix.length; j++) {
        // matrix[i][j] = traspuesta[i][j] * - 1;
        // }
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

    public static void ej20(Scanner read) {
        // constants for matrix
        final int MATRIX_SIZE = 3;
        final int MIN_NUMBER = 1;
        final int MAX_NUMBER = 9;

        int[][] matrix = new int[MATRIX_SIZE][MATRIX_SIZE];
        int[] sumas = new int[2 * MATRIX_SIZE + 2];
        boolean magico = true;

        // Fill matrix and calculate sums
        fillMatrix(matrix, read, MIN_NUMBER, MAX_NUMBER);
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

    public static void fillMatrix(int[][] matrix, Scanner read, int minNumber, int maxNumber) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                do {
                    System.out.println("Ingrese un número entre " + minNumber + " y " + maxNumber);
                    matrix[i][j] = read.nextInt();
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

    // Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la
    // matriz P de 3x3, se solicita escribir un programa en el cual se compruebe si
    // la matriz P está contenida dentro de la matriz M. Para ello se debe verificar
    // si entre todas las submatrices de 3x3 que se pueden formar en la matriz M,
    // desplazándose por filas o columnas, existe al menos una que coincida con la
    // matriz P. En ese caso, el programa debe indicar la fila y la columna de la
    // matriz M en la cual empieza el primer elemento de la submatriz p.

    public static void ej21(Scanner read) {
        final int MATRIX_M_SIZE = 10;
        final int MATRIX_P_SIZE = 3;

        int[][] matrixM = new int[MATRIX_M_SIZE][MATRIX_M_SIZE];
        int[][] matrixP = new int[MATRIX_P_SIZE][MATRIX_P_SIZE];

        fillMatrix(matrixM, read, 0, 9);
        fillMatrix(matrixP, read, 0, 9);

        boolean found = false;
        int startRow = -1;
        int startCol = -1;

        for (int i = 0; i <= MATRIX_M_SIZE - MATRIX_P_SIZE; i++) {
            for (int j = 0; j <= MATRIX_M_SIZE - MATRIX_P_SIZE; j++) {
                if (isSubmatrixMatch(matrixM, matrixP, i, j)) {
                    found = true;
                    startRow = i;
                    startCol = j;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (found) {
            System.out.println("La matriz P está contenida en la matriz M.");
            System.out.println("La submatriz P comienza en la fila " + startRow + " y columna " + startCol + ".");
        } else {
            System.out.println("La matriz P no está contenida en la matriz M.");
        }
    }

    public static boolean isSubmatrixMatch(int[][] matrixM, int[][] matrixP, int startRow, int startCol) {
        for (int i = 0; i < matrixP.length; i++) {
            for (int j = 0; j < matrixP[i].length; j++) {
                if (matrixM[startRow + i][startCol + j] != matrixP[i][j]) {
                    return false;
                }
            }
        }
        return true;

    }

    public static void extra_1(Scanner read) {
        System.out.println("Ingrese minutos");
        int minutes = read.nextInt();
        int hours = minutes / 60;
        int days = hours / 24;
        hours = hours % 24;

        System.out.println("Dias: " + days);
        System.out.println("Horas: " + hours);

    }

    public static void extra_2() {
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println("Los valores iniciales");
        System.out.println("A: " + C);
        System.out.println("B: " + D);
        System.out.println("C: " + B);
        System.out.println("D: " + A);

        System.out.println("Los valores finales");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);

    }

    public static void extra_3(Scanner read) {
        String letter = read.nextLine();

        switch (letter.toLowerCase()) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Es vocal");
                break;
            default:
                System.out.println("No es vocal");
                break;
        }

    }

    public static void extra_4(Scanner read) {
        System.out.print("Enter a number from 1 to 10: ");
        int number = read.nextInt();

        if (number < 1 || number > 10) {
            System.out.println("Invalid number. Please enter a number from 1 to 10.");
            return;
        }

        String[] romanNumerals = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" };
        String romanNumeral = romanNumerals[number - 1];

        System.out.println("The Roman numeral representation of " + number + " is: " + romanNumeral);
    }

    public static void extra_5(Scanner read) {
        System.out.println("Ingrese tipo de obra social (A, B, C)");
        String healthcare = read.nextLine();
        float cost = read.nextFloat();
        float total = 0;

        switch (healthcare.toLowerCase()) {
            case "a":
                total = cost * 0.5f;
                break;
            case "b":
                total = cost * 0.65f;
                break;
            case "c":
                total = cost;
                break;
            default:
                System.out.println("Invalid healthcare");
                break;
        }
        System.out.println("Total: " + total);
    }

    // Leer la altura de N personas y determinar el promedio de
    // estaturas que se encuentran por debajo de 1.60 mts. y el
    // promedio de estaturas en general.
    public static void extra_6(Scanner read) {
        System.out.println("Ingrese cantidad de personas");
        int n = read.nextInt();
        float[] heights = new float[n];
        float total = 0;
        float totalBelow = 0;
        int below = 0;

        for (int i = 0; i < heights.length; i++) {
            System.out.println("Ingrese altura");
            heights[i] = read.nextFloat();
            total += heights[i];
            if (heights[i] < 1.6) {
                totalBelow += heights[i];
                below++;
            }
        }
        System.out.println("Promedio de estaturas en general: " + total / n);
        System.out.println("Promedio de estaturas por debajo de 1.6: " + totalBelow / below);
    }

    // realice un programa que calcule y visualice el valor maximo,
    // el valor minimo y el promedio de n numeros (n debe ser mayor que 0).
    // El valor de n se solicitará al principio del programa y los numeros
    // seran introducidos por el usuario. Realice dos versiones del programa,
    // una usando el bucle "while" y otra con el bucle "do - while".

    public static void extra_7(Scanner read) {
        System.out.print("Ingrese la cantidad de números (n > 0): ");
        int n = read.nextInt();

        if (n <= 0) {
            System.out.println("El valor de n debe ser mayor que 0.");
            return;
        }

        int contador = 0;
        int numero;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int suma = 0;

        System.out.println("Ingrese los números:");
        while (contador < n) {
            numero = read.nextInt();
            maximo = Math.max(maximo, numero);
            minimo = Math.min(minimo, numero);
            suma += numero;
            contador++;
        }

        double promedio = (double) suma / n;

        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);
        System.out.println("Promedio: " + promedio);

    }

    public static void extra_7B(Scanner read) {
        System.out.print("Ingrese la cantidad de números (n > 0): ");
        int n = read.nextInt();

        if (n <= 0) {
            System.out.println("El valor de n debe ser mayor que 0.");
            return;
        }

        int contador = 0;
        int numero;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int suma = 0;

        System.out.println("Ingrese los números:");
        read.nextLine();
        do {
            numero = read.nextInt();
            maximo = Math.max(maximo, numero);
            minimo = Math.min(minimo, numero);
            suma += numero;
            contador++;
        } while (contador < n);

        double promedio = (double) suma / n;

        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);
        System.out.println("Promedio: " + promedio);

    }

    // escriba un programa que lea numeros enteros. Si el numero es multiplo
    // de cinco debe detener la lectura y mostrar la cantidad de numeros leidos,
    // la cantidad de numeros pares y la cantidad de numeros impares. Los numeros
    // negativos no deben sumarse. Recordar el uso de la sentencia break

    public static void extra_8(Scanner read) {
        int numero;
        int pares = 0;
        int impares = 0;
        int total = 0;

        while (true) {
            System.out.print("Ingrese un número: ");
            numero = read.nextInt();

            if (numero % 5 == 0) {
                break;
            }

            if (numero < 0) {
                continue;
            }

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            total++;
        }

        System.out.println("Cantidad de números leídos: " + total);
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }


    // Simular la division usando solamente restas. Dados dos numeros enteros
    // mayores que uno, realizar un algoritmo que calcule el cociente y el resto
    // usando solo restas. Metodo: Restar el dividendo del divisor hasta obtener
    // un valor menor que el divisor, este valor es el resto, y el numero de
    // restas realizadas es el cociente. Por ejemplo: 50 / 13:
    // 50 - 13 = 37 una resta realizada
    // 37 - 13 = 24 dos restas realizadas
    // 24 - 13 = 11 tres restas realizadas
    // 11 - 13 = -2 fin de las restas, el cociente es 3 y el resto 11

    public static void extra_9(Scanner read) {
        System.out.print("Ingrese el dividendo: ");
        int dividendo = read.nextInt();

        System.out.print("Ingrese el divisor: ");
        int divisor = read.nextInt();

        if (divisor <= 1) {
            System.out.println("El divisor debe ser mayor que 1.");
            return;
        }

        int cociente = 0;
        int resto = dividendo;

        while (resto >= divisor) {
            resto -= divisor;
            cociente++;
        }

        System.out.println("Cociente: " + cociente);
        System.out.println("Resto: " + resto);
    }


    // realice un programa para que el usuario adivine el resultado de
    // una multiplicacion entre dos numeros generados aleatoriamente entre 0 y 10.
    // El programa debe indicar al usuario si su respuesta es o no correcta.
    // En caso que la respuesta sea incorrecta se debe permitir al usuario
    // ingresar su respuesta nuevamente. Para realizar este ejercicio investigue
    // como utilizar la funcion Math.random() de Java.

    public static void extra_10(Scanner read) {
        int numero1 = (int) (Math.random() * 11);
        int numero2 = (int) (Math.random() * 11);
        int resultado = numero1 * numero2;
        int respuesta;

        do {
            System.out.print("¿Cuánto es " + numero1 + " * " + numero2 + "? ");
            respuesta = read.nextInt();

            if (respuesta != resultado) {
                System.out.println("Respuesta incorrecta.");
            }
        } while (respuesta != resultado);

        System.out.println("Respuesta correcta.");
    }

    // escribir un programa que lea un numero entero y devuelva
    // el numero de cifras que componen ese numero. Por ejemplo,
    // si introducimos el numero 1250, el programa debera devolver
    // que tiene 4 cifras. Calcular la cantidad de digitos matematicamente
    // utilizando el operador de division. Nota: recordar que las

    public static void extra_11(Scanner read) {
        System.out.print("Ingrese un número entero: ");
        int numero = read.nextInt();

        if (numero < 0) {
            numero *= -1;
        }

        int digitos = 0;

        do {
            numero /= 10;
            digitos++;
        } while (numero > 0);

        System.out.println("El número tiene " + digitos + " dígitos.");
    }

    // necesitamos mostrar un contador con 3 digitos (X-X-X),
    // que muestre los numeros del 0-0-0 al 9-9-9, con la particularidad
    // que cada vez que que aparezca un 3 lo sustituya por una E.
    // nota: investiga funcion equals() y como convetir numeros a String.

    public static void extra_12() {
        for (int i = 0; i <= 9; i++) {
            String iString = String.valueOf(i);
            if (i == 3) {
                iString = "E";
            }

            for (int j = 0; j <= 9; j++) {
                String jString = String.valueOf(j);

                if (j == 3) {
                    jString = "E";
                }

                for (int k = 0; k <= 9; k++) {
                    String kString = String.valueOf(k);

                    if (k == 3) {
                        kString = "E";
                    }

                    System.out.println(iString + "-" + jString + "-" + kString);
                }
            }
        }
    }

    // crear un programa que dibuje una escalera de numeros, donde cada linea
    // de numeros comience en uno y termine en el numero de la linea. Solicitar
    // la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa
    // el numero 3:
    // 1
    // 12
    // 123

    public static void extra_13(Scanner read) {
        System.out.print("Ingrese la altura de la escalera: ");
        int altura = read.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // se dispone de un conjunto de N familias, cada una de las cuelas tiene una M cantidad
    // de hijos. Escriba un programa que pida la cantidad de familias y para cada familia
    // la cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.

    public static void extra_14(Scanner read) {
        System.out.print("Ingrese la cantidad de familias: ");
        int cantidadFamilias = read.nextInt();

        if (cantidadFamilias <= 0) {
            System.out.println("La cantidad de familias debe ser mayor que 0.");
            return;
        }

        int totalHijos = 0;
        int totalEdad = 0;

        for (int i = 1; i <= cantidadFamilias; i++) {
            System.out.print("Ingrese la cantidad de hijos de la familia " + i + ": ");
            int cantidadHijos = read.nextInt();

            if (cantidadHijos <= 0) {
                System.out.println("La cantidad de hijos debe ser mayor que 0.");
                return;
            }

            for (int j = 1; j <= cantidadHijos; j++) {
                System.out.print("Ingrese la edad del hijo " + j + ": ");
                int edad = read.nextInt();

                if (edad <= 0) {
                    System.out.println("La edad debe ser mayor que 0.");
                    return;
                }

                totalHijos++;
                totalEdad += edad;
            }
        }

        double promedio = (double) totalEdad / totalHijos;

        System.out.println("El promedio de edad de los hijos de todas las familias es: " + promedio);
    }


    // crea una aplicacion que le pida dos numeros al usuario y este
    // pueda elegir entre sumar, restar, multiplicar y dividir. La aplicacion
    // debe tener una funcion para cada operacion matematica y deben devolver
    // sus resultados para imprimirlos en el main.

    public static void extra_15(Scanner read) {
        System.out.print("Ingrese el primer número: ");
        int numero1 = read.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = read.nextInt();

        System.out.println("¿Qué operación desea realizar?");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        int opcion = read.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma es: " + sumar(numero1, numero2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + restar(numero1, numero2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es: " + multiplicar(numero1, numero2));
                break;
            case 4:
                System.out.println("El resultado de la división es: " + dividir(numero1, numero2));
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }

    }

    public static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public static double dividir(int numero1, int numero2) {
        return (double) numero1 / numero2;
    }

    // Diseñe una funcion que pida el nombre y la edad de N personas
    // e imprima los datos de las personas ingresadas por teclado e indique
    // si son mayores o menores de edad. Despues de cada persona, el programa
    // debe preguntarle al usuario si quiere seguir mostrando personas y frenar
    // cuando el usuario ingrese la palabra "no".

    public static void extra_16(Scanner read) {
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese el nombre de la persona: ");
            String nombre = read.nextLine();

            System.out.print("Ingrese la edad de la persona: ");
            int edad = read.nextInt();
            read.nextLine();

            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);

            if (edad >= 18) {
                System.out.println("Es mayor de edad.");
            } else {
                System.out.println("Es menor de edad.");
            }

            System.out.print("¿Desea seguir mostrando personas? (si/no) ");
            String respuesta = read.nextLine();

            if (respuesta.equals("no")) {
                continuar = false;
            }
        }
    }

    // Realizar un programa que complete un vector con los N primeros
    // numeros de la sucesion de fibonacci usando recursion

    public static void extra_17(Scanner read) {
        System.out.print("Ingrese la cantidad de números de la sucesión de Fibonacci: ");
        int cantidad = read.nextInt();

        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que 0.");
            return;
        }

        int[] sucesion = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            sucesion[i] = fibonacci(i);
        }

        System.out.println("Los primeros " + cantidad + " números de la sucesión de Fibonacci son:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(sucesion[i] + " ");
        }
        System.out.println();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void extra_23(Scanner read) {
        int WORD_SOUP_SIZE = 20;
        String[][] wordSoup = new String[WORD_SOUP_SIZE][WORD_SOUP_SIZE];
        Set<Integer> occupiedRows = new HashSet<>();
        int[] columns = new int[5];
        String[] word = new String[5];
        int wordPosition = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese una palabra");
            word[i] = read.nextLine();

            while (word[i].length() > 5 || word[i].length() < 3) {
                word[i] = read.nextLine();
            }
            int wordPositionRow;

            do {

                wordPositionRow = (int) (Math.random() * WORD_SOUP_SIZE);
                
            } while (occupiedRows.contains(wordPositionRow));

            occupiedRows.add(wordPositionRow);
            
            int wordPositionColumn = (int) (Math.random() * (WORD_SOUP_SIZE - word[i].length() - 1));
            columns[i] = wordPositionColumn;
        }

        for (int i = 0; i < wordSoup.length; i++) {
            
            int letterPosition = 0;
            for (int j = 0; j < wordSoup.length; j++) {
                if (occupiedRows.contains(i)) {
                    if (j >= columns[wordPosition] && letterPosition < word[wordPosition].length()) {
                        String letter = word[wordPosition].substring(letterPosition, letterPosition+1);
                        wordSoup[i][j] = letter;
                        letterPosition += 1;
                    }
                }
                if (!occupiedRows.contains(i) || j < columns[wordPosition] || j > (columns[wordPosition] + word[wordPosition].length() - 1)) {
                    int random = (int) (Math.random() * 10);
                    wordSoup[i][j] = Integer.toString(random);
                }
            }

            if (occupiedRows.contains(i)) {
                wordPosition += 1;
            }
        }

        showStringMatrix(wordSoup);
    }

    public static void showStringMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }



    





    
}
