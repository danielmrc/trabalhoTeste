package trabalho.teste;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        Calculadora calc = new Calculadora();

        assertTrue(calc != null);

        assertEquals(7,calc.soma(2,5));
        assertEquals(-3,calc.subtrai(2,5));
        assertEquals(2,calc.divide(10,5));
        assertEquals(-1,calc.divide(7,0));
        assertEquals(-66,calc.multiplica(-2,43));
    }

}