/*
    Los métodos que se implementara serán:

    • Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
    padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    los atributos del televisor.
    • Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
    incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
    $500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
    también deben afectar al precio.
 */
package services;

import entities.Electrodomestico;
import entities.Televisor;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class ServicioTelevisor extends ServicioElectrodomestico{
    
    Televisor tv = new Televisor();
    
    public void crearTelevisor (){

        Scanner input = new Scanner(System.in);
        
        Electrodomestico electrodomestico = crearElectrodomestico();
        
        tv.setColor(electrodomestico.getColor());
        tv.setConsumo(electrodomestico.getConsumo());
        tv.setPeso(electrodomestico.getPeso());
        tv.setPrecio(electrodomestico.getPrecio());
        
        System.out.println("Ingrese la resolución: ");
        tv.setResolucion(input.nextInt()); 
        
        System.out.println("Tiene un sintonizador TDT incorporado? (Si/No) ");
        String isTDT = input.next();
        
        if (isTDT.equalsIgnoreCase("si")){
            tv.setSintonizador(true);
        }

        input.close();
    }    
    
    @Override
    public void precioFinal(){
        
        super.precioFinal();
        
        if(tv.getResolucion() > 40){
            
            tv.setPrecio((tv.getPrecio() * 1.3));                      
        }
        
        if(tv.isSintonizador()){
            
            tv.setPrecio((tv.getPrecio() + 500));                      
        }
    }   
    
    @Override
    public void mostrar(){

        System.out.println(tv);
    }    
    
}
