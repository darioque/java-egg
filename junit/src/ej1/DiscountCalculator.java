package ej1;

public class DiscountCalculator {
    int precioActual;
    int nuevoPrecio;

    public DiscountCalculator(int precioActual, int nuevoPrecio) {
        this.precioActual = precioActual;
        this.nuevoPrecio = nuevoPrecio;
    }

    public int calculateDiscount() {
        int diferencia = precioActual - nuevoPrecio;
        int descuento = (diferencia * 100) / precioActual;
        return descuento;
    }


}
