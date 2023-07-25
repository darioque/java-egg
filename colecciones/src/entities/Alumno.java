package entities;

import java.util.ArrayList;

public class Alumno {
    String name;
    ArrayList<Integer> notas = new ArrayList<Integer>();

    public Alumno() {
    }

    public Alumno(String name, ArrayList<Integer> notas) {
        this.name = name;
        this.notas = notas;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Integer> getNotas() {
        return notas;
    }
    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    
    
}
