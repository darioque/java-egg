package services;

import entities.Matematica;

public class MatematicaService {

    // Matematica matematica = new Matematica();
    
    public Matematica crearMatematica(double numero1, double numero2) {
        return new Matematica(numero1, numero2);
    }

    public double devolverMayor(Matematica matematica) {
        if (matematica.getNumero1() > matematica.getNumero2()) {
            return matematica.getNumero1();
        } else {
            return matematica.getNumero2();
        }
    }

    public double calcularPotencia(Matematica matematica) {
        double mayor = devolverMayor(matematica);
        double menor = Double.min(matematica.getNumero1(), matematica.getNumero2());
        return Math.pow(Math.round(menor), Math.round(mayor));
    }

    public double calculaRaiz(Matematica matematica) {
        double menor = Double.min(matematica.getNumero1(), matematica.getNumero2());
        menor = Math.abs(menor);
        return Math.sqrt(menor);
    }
}
