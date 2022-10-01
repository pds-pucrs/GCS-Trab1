package T1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

/**
 * Unit test for simple App.
 */
public class MainAppTest {
    /**
     * Rigorous Test :-)
     */
    // @Test
    // public void shouldAnswerWithTrue() {
    //     assertTrue(true);
    // }

    @Test  
    public void impares_entre_4_e_5() {
        // Arrange
        final int expected = 0;

        //Act  
        final int actual = MainAppCalculos.somaImpares(4,5);

        assertEquals(expected, actual);
    }

    @Test  
    public void impares_entre_13_e_10() {
        // Arrange
        final int expected = 11;

        //Act  
        final int actual = MainAppCalculos.somaImpares(13,10);

        assertEquals(expected, actual);
    }

    @Test  
    public void impares_entre_6_e_4() {
        // Arrange
        final int expected = 5;

        //Act  
        final int actual = MainAppCalculos.somaImpares(6, 4);

        assertEquals(expected, actual);
    }

    @Test  
    public void impares_entre_3_e_3() {
        // Arrange
        final int expected = 0;

        //Act  
        final int actual = MainAppCalculos.somaImpares(3,3);

        assertEquals(expected, actual);
    }

    @Test  
    public void impares_entre_3_e_5() {
        // Arrange
        final int expected = 0;

        //Act  
        final int actual = MainAppCalculos.somaImpares(3,5);

        assertEquals(expected, actual);
    }

    @Test  
    public void impares_entre_3_e_4() {
        // Arrange
        final int expected = 0;

        //Act  
        final int actual = MainAppCalculos.somaImpares(3,4);

        assertEquals(expected, actual);
    }

    @Test  
    public void impares_entre_3_e_8() {
        // Arrange
        final int expected = 0;

        //Act  
        final int actual = MainAppCalculos.somaImpares(3,5);

        assertEquals(expected, actual);
    }

    // @Test  
    // public void impares_entre_4_e_5C() {
    //     // Arrange
    //     final int expected = 0;

    //     //Act  
    //     final int actual = MainAppCalculos.somaImpares(4,5);

    //     assertEquals(expected, actual);
    // }

    // @Test  
    // public void impares_entre_4_e_5C() {
    //     // Arrange
    //     final int expected = 0;

    //     //Act  
    //     final int actual = MainAppCalculos.somaImpares(4,5);

    //     assertEquals(expected, actual);
    // }

    // @Test  
    // public void impares_entre_4_e_5C() {
    //     // Arrange
    //     final int expected = 0;

    //     //Act  
    //     final int actual = MainAppCalculos.somaImpares(4,5);

    //     assertEquals(expected, actual);
    // }

}