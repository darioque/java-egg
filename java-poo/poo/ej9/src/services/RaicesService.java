
package services;

import entities.Raices;

public class RaicesService {
    
    public Raices crearRaices(Double a, Double b, Double c) {
        return new Raices(a, b, c );
    }

    public double getDiscriminante(Raices r) {
        return Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC());
    }

    public boolean tieneRaices(Raices r) {
        return getDiscriminante(r) >= 0;
    }

    public boolean tieneRaiz(Raices r) {
        return getDiscriminante(r) == 0;
    }

    public void obtenerRaices(Raices r) {
        if (tieneRaices(r)) {
            double x1 = (-r.getB() + Math.sqrt(getDiscriminante(r))) / (2 * r.getA());
            double x2 = (-r.getB() - Math.sqrt(getDiscriminante(r))) / (2 * r.getA());
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("No tiene raices");
        }
    }

    public void obtenerRaiz(Raices r) {
        if (tieneRaiz(r)) {
            double x = (-r.getB() + Math.sqrt(getDiscriminante(r))) / (2 * r.getA());
            System.out.println("x = " + x);
        } else {
            System.out.println("No tiene raiz");
        }
    }

    public void calcular(Raices r) {
        if (tieneRaices(r)) {
            obtenerRaices(r);
        } else if (tieneRaiz(r)) {
            obtenerRaiz(r);
        } else {
            System.out.println("No tiene solucion");
        }
    }

}
