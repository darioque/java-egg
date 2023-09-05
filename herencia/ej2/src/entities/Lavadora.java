/*
    A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
    además de los atributos heredados.
    Los constructores que se implementarán serán:
    • Un constructor vacío.
    • Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
    llamar al constructor de la clase padre.
    • Método get y set del atributo carga.
 */
package entities;

import enumeraciones.consumoEnergetico;
import enumeraciones.enumColor;

/**
 *
 * @author carol
 */
public class Lavadora extends Electrodomestico{
    
    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, Double precio, enumColor color, consumoEnergetico consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
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
        
        return "Lavadora: " + super.toString() + " carga = " + carga + '}';
    }
}
