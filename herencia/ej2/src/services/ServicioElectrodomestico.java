/*
    • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
    sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
    objeto y no será visible.

    • Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
    usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
    blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
    minúsculas. Este método se invocará al crear el objeto y no será visible.

    • Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
    precio se le da un valor base de $1000.

    • Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
    precio.
 */
package services;

import entities.Electrodomestico;
import enumeraciones.consumoEnergetico;
import enumeraciones.enumColor;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class ServicioElectrodomestico {
    
    Electrodomestico electro = new Electrodomestico();

    public Electrodomestico getElectro() {
        return electro;
    }

    public void setElectro(Electrodomestico electro) {
        this.electro = electro;
    }
    
    public void comprobarConsumoEnergetico(char letra){
        
        switch(letra){
                case 'A':
                    electro.setConsumo(consumoEnergetico.A);
                    break;
                    
                case 'B':
                    electro.setConsumo(consumoEnergetico.B);
                    break;
                    
                case 'C':
                    electro.setConsumo(consumoEnergetico.C);
                    break;
                    
                case 'D':
                    electro.setConsumo(consumoEnergetico.D);
                    break;
                    
                case 'E':
                    electro.setConsumo(consumoEnergetico.E);
                    break;
                    
                default:
                    electro.setConsumo(consumoEnergetico.F);
                    break;                
        }            
    }
    
    public void comprobarColor(String color){
        
        color = color.toUpperCase();
        
        switch(color){
        case "NEGRO":
            electro.setColor(enumColor.NEGRO);
            break;

        case "ROJO":
            electro.setColor(enumColor.ROJO);
            break;

        case "AZUL":
            electro.setColor(enumColor.AZUL);
            break;

        case "GRIS":
            electro.setColor(enumColor.GRIS);
            break;

        default:
            electro.setColor(enumColor.BLANCO);
            break;                
        }  
    }    

    public Electrodomestico crearElectrodomestico(){
        
        Scanner input = new Scanner(System.in);
        
        electro.setPrecio(1000.0);
        
        System.out.println("Ingrese el color: ");
        String color = input.nextLine();
        comprobarColor(color);
        
        System.out.println("Ingrese el consumo (A - F): ");
        char consumo = input.next().charAt(0);
        comprobarConsumoEnergetico(consumo);
        
        System.out.println("Ingrese el peso: ");
        electro.setPeso(input.nextDouble());

        input.close();
        
        return electro;
    }
    
    public void precioFinal(){
        
        Double precioFinal = electro.getPrecio();
        
        switch(electro.getConsumo()){
                case A:
                    precioFinal += 1000;
                    break;
                    
                case B:
                    precioFinal += 800;
                    break;
                    
                case C:
                    precioFinal += 600;
                    break;
                    
                case D:
                    precioFinal += 500;
                    break;
                    
                case E:
                    precioFinal += 300;
                    break;
                    
                default:
                    precioFinal += 100;
                    break;                
        } 
        
        if(electro.getPeso() <= 19.0){
            
            precioFinal += 100;
                       
        } else if ((electro.getPeso() > 19.0) && (electro.getPeso() <= 49.0)){
            
            precioFinal += 500;
            
        } else if((electro.getPeso() > 49.0) && (electro.getPeso() <= 79.0)){
            
            precioFinal += 800;
            
        } else{
            
            precioFinal += 1000;
        }
        
        electro.setPrecio(precioFinal);
        
    }
    
    public void mostrar(){
        System.out.println(electro.toString());
    }
    
}
