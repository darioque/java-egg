package ej3;

public class PasswordValidator {

    public static boolean esValida(String password) {
        return password.length() > 8 && password.length() < 16;

    }

    public static String verificarFortaleza(String password) {
        int caracteresEspeciales = 0;
        int mayusculas = 0;
        int numeros = 0;

        for (int i = 0; i < password.length(); i++) {
            String letter = password.substring(i, i+1);
            if (letter.matches("[^a-zA-Z0-9]")) {
                caracteresEspeciales++;
            } else if (letter.matches("[A-Z]")) {
                mayusculas++;
            } else if (letter.matches("[0-9]")) {
                numeros++;
            }
        }
        int fortalezaTotal = caracteresEspeciales + mayusculas + numeros;

        if (fortalezaTotal < 3) {
            return "Muy débil";
        } else if (fortalezaTotal < 5) {
            return "Débil";
        } else if (fortalezaTotal < 7) {
            return "Fuerte";
        } else {
            return "Muy fuerte";
        }
    }


    
}
