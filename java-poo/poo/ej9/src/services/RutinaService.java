package services;

import java.util.ArrayList;

import entities.Rutina;

public class RutinaService {

    private ArrayList<Rutina> rutinas = new ArrayList<Rutina>();

    public Rutina crearRutina(int id, String nombre, int duracion, int nivelDificultad, String descripcion) {
        Rutina rutina = new Rutina(id, nombre, duracion, nivelDificultad, descripcion);
        return rutina;
    }

    public void registrarRutina(Rutina rutina) {
        rutinas.add(rutina);
    }

    public ArrayList<Rutina> obtenerRutinas() {
        return rutinas;
    }

    public void actualizarRutina(int id, String nombre, int duracion, int nivelDificultad, String descripcion) {
        Rutina rutina = (Rutina) rutinas.get(id);
        rutina.setNombre(nombre);
        rutina.setDuracion(duracion);
        rutina.setNivelDificultad(nivelDificultad);
        rutina.setDescripcion(descripcion);
    }

    public void eliminarRutina(int id) {
        rutinas.remove(id);
    }

    public void mostrarRutinas() {
        for (Rutina rutina : rutinas) {
            System.out.println(rutina);
        }
    }
}
