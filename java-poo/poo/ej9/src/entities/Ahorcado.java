package entities;

public class Ahorcado {
    private String[] palabra;

    private int cantLetras;

    private int intentos;
    
    public Ahorcado() {

    }

    public Ahorcado(String[] palabra, int cantLetras, int intentos) {
        this.palabra = palabra;
        this.cantLetras = cantLetras;
        this.intentos = intentos;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantLetras() {
        return cantLetras;
    }

    public void setCantLetras(int cantLetras) {
        this.cantLetras = cantLetras;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    

}
