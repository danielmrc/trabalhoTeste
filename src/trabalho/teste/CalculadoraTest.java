package trabalho.teste;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void soma() {
        Calculadora calc = new Calculadora();
        assertEquals(4,calc.soma(2,2));
        assertEquals(6,calc.soma(2,4));
        assertEquals(10,calc.soma(8,2));
        assertEquals(121,calc.soma(60.5,60.5));
    }

    @Test
    void subtrai() {
        Calculadora calc = new Calculadora();
        assertEquals(0,calc.subtrai(2,2));
        assertEquals(-2,calc.subtrai(2,4));
        assertEquals(10,calc.subtrai(12,2));
        assertEquals(240,calc.subtrai(440,200));
    }

    @Test
    void divide() {
        Calculadora calc = new Calculadora();
        assertEquals(1,calc.divide(2,2));
        assertEquals(0.5,calc.divide(2,4));
        assertEquals(5,calc.divide(15,3));
        assertEquals(120,calc.divide(600,5));
        assertEquals(-1, calc.divide(3,0));
    }

    @Test
    void multiplica() {
        Calculadora calc = new Calculadora();
        assertEquals(4,calc.multiplica(2,2));
        assertEquals(20,calc.multiplica(5,4));
        assertEquals(300,calc.multiplica(75,4));
        assertEquals(-84,calc.multiplica(2,-42));
    }
}