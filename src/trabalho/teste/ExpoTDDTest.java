package trabalho.teste;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpoTDDTest {

    @Test
    void exp() {
        ExpoTDD ex = new ExpoTDD();

        assertEquals(8, ex.exp(2,3));
    }
}