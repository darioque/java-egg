package entities;

import java.util.ArrayList;

public class PersonaService {
    
    private ArrayList<String> personas = new ArrayList<String>(10);

    public PersonaService() {
        personas.add("Juan");
        personas.add("Pedro");
        personas.add("Maria");
        personas.add("Jose");
        personas.add("Luis");
        personas.add("Ana");
        personas.add("Carlos");
        personas.add("Luisa");
        personas.add("Jorge");
        personas.add("Javier");
    }

    public ArrayList<String> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<String> personas) {
        this.personas = personas;
    }

    public void tirarExcepcion() {
        try {
            personas.get(11);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
