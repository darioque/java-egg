/*
    Los métodos que se implementara serán:
    • Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
    padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    el atributo propio de la lavadora.
    • Método precioFinal(): este método será heredado y se le sumará la siguiente
    funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
    carga es menor o igual, no se incrementará el precio. Este método debe llamar al
    método padre y añadir el código necesario. Recuerda que las condiciones que hemos
    visto en la clase Electrodoméstico también deben afectar al precio.
 */
package services;

import entities.Electrodomestico;
import entities.Lavadora;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class ServicioLavadora extends ServicioElectrodomestico{
    
    Lavadora lavadora = new Lavadora();    
    
    public void crearLavadora (){

        Scanner input = new Scanner(System.in);
        
        Electrodomestico electrodomestico = crearElectrodomestico();
        
        lavadora.setColor(electrodomestico.getColor());
        lavadora.setConsumo(electrodomestico.getConsumo());
        lavadora.setPeso(electrodomestico.getPeso());
        lavadora.setPrecio(electrodomestico.getPrecio());
        
        System.out.println("Ingrese la carga: ");
        lavadora.setCarga(input.nextInt()); 

        input.close();
        
    }
    
    @Override
    public void precioFinal(){
        
        super.precioFinal();
        
        if(lavadora.getCarga() > 30){
            
            lavadora.setPrecio((lavadora.getPrecio() + 500));                      
        }
        
    }
    
    @Override
    public void mostrar(){

        System.out.println(lavadora);
    }
    
}