import services.ServicioLavadora;
import services.ServicioTelevisor;

public class Herencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioLavadora sl = new ServicioLavadora();
        sl.crearLavadora();
        sl.precioFinal();
        sl.mostrar();
        
        ServicioTelevisor st = new ServicioTelevisor();
        st.crearTelevisor();
        st.precioFinal();
        st.mostrar();
        
    }
    
}
