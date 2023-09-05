/*
    Se debe crear también una subclase llamada Televisor con los siguientes atributos:
    resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
    heredados.
    Los constructores que se implementarán serán:
    • Un constructor vacío.
    • Un constructor con la resolución, sintonizador TDT y el resto de los atributos
    heredados. Recuerda que debes llamar al constructor de la clase padre.
    • Método get y set de los atributos resolución y sintonizador TDT.

 */
package entities;

import enumeraciones.consumoEnergetico;
import enumeraciones.enumColor;

/**
 *
 * @author carol
 */
public class Televisor extends Electrodomestico{
    
    protected Integer resolucion;
    protected boolean sintonizador;

    public Televisor() {
    }

    public Televisor(Integer resolucion, boolean sintonizador, Double precio, enumColor color, consumoEnergetico consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    @Override
    public String toString() {
        return "Televisor: " + super.toString() + "resolucion = " + resolucion + ", sintonizador = " + sintonizador + '}';
    }
    
}
