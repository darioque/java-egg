package services;

import java.util.ArrayList;

import entities.Alumno;

public class AlumnoService {
    public ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

    public void createAlumnos() {
        while (true) {
            Alumno alumno = new Alumno();
            System.out.println("Ingrese el nombre del alumno");
            String name = System.console().readLine();
            alumno.setName(name);
            ArrayList<Integer> notas = new ArrayList<Integer>();
    
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota " + (i + 1));
                Integer nota = Integer.parseInt(System.console().readLine());
                notas.add(nota);
            }
    
            alumno.setNotas(notas);
            alumnos.add(alumno);

            System.out.println("Do you want to add another student? yes/no");
            String option = System.console().readLine();
            if (option.equals("no")) {
                break;
            }
        }
    }

    public void showAlumnos() {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getName());
            System.out.println(alumno.getNotas());
        }
    }

    public double notaFinal(Alumno alumno) {
        double notaFinal = 0;
        for (Integer nota : alumno.getNotas()) {
            notaFinal += nota;
        }
        return notaFinal / alumno.getNotas().size();
    }
}
