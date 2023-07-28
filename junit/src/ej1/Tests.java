package ej1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

public class Tests {
    private static DiscountCalculator calculator;

    @Before
    public void setUp() {
        calculator = new DiscountCalculator(100, 50); 
        System.out.println("setUp");
    }
    
    @Test 
    public void testCalculateDiscount() {
        int result = calculator.calculateDiscount();
        assertEquals("Expected discount value of 50", 50, result);
    }
}
