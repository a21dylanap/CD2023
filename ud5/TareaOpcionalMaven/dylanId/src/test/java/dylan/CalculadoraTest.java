package dylan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    
    @Test
    public void testSumar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
        assertEquals(10, calc.sumar(7, 3));
        assertEquals(-2, calc.sumar(-5, 3));
    }
    
    @Test
    public void testRestar() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.restar(3, 2));
        assertEquals(4, calc.restar(7, 3));
        assertEquals(-8, calc.restar(2, 10));
    }
}
