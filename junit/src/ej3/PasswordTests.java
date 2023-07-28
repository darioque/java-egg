package ej3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PasswordTests {
    

    @Before
    public void setUp() {
        
    }

    @Test
    public void tieneLongitudApropiada() {
        String password = "aasdas";
        boolean esValida = PasswordValidator.esValida(password);

        assertTrue("La longitud es incorrecta", esValida);
    }

    @Test
    public void fortaleza() {
        // instatiate strong password
        String strongPassword = "F%a85aAMa";
        String fortaleza = PasswordValidator.verificarFortaleza(strongPassword);

        assertEquals("La fortaleza es incorrecta", "Muy fuerte", fortaleza);
        
    }
}
