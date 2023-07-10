package services;

import entities.NIF;
import java.util.Scanner;

public class NIFService {
    

    public NIF crearNIF() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el DNI: ");
        long DNI = sc.nextLong();
        NIF nif = new NIF(DNI, getLetra(DNI));
        sc.close();
        return nif;
    }

    public void mostrar(NIF nif) {
        System.out.println(nif.getDNI() + "-" + nif.getLetra());
    }

    public char getLetra(long DNI) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                         'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                         'C', 'K', 'E'};
        int posicion = (int) (DNI % 23);
        return letras[posicion];
    }
}
