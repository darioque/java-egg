/*
   Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
    consumo energético (letras entre A y F) y peso.

    Los constructores que se deben implementar son los siguientes:
    • Un constructor vacío.
    • Un constructor con todos los atributos pasados por parámetro.
    • Métodos getters y setters de todos los atributos.
 */
package entities;

import enumeraciones.consumoEnergetico;
import enumeraciones.enumColor;

/**
 *
 * @author carol
 */
public class Electrodomestico {
    
    protected Double precio;
    protected enumColor color;
    protected consumoEnergetico consumo;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, enumColor color, consumoEnergetico consumo, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public enumColor getColor() {
        return color;
    }

    public void setColor(enumColor color) {
        this.color = color;
    }

    public consumoEnergetico getConsumo() {
        return consumo;
    }

    public void setConsumo(consumoEnergetico consumo) {
        this.consumo = consumo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "{" + "precio = " + precio + ", color = " + color + ", consumo = " + consumo + ", peso = " + peso;
    }
    
}
