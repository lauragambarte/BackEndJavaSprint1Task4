package nivel1.ejercicio1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class MesTest {

    @Test
    /*void sumaTest() {
        int firstNumber = 2;
        int secondNumber = 3;

        int result = Mes.suma(firstNumber, secondNumber);

        assertEquals(5, result);*/
    void mesTest() {
        //1 Run the code you want to test. Var is a variable but I dont have to provide the type because Java is smart.
        //2 Assert result(actual result)
        List<String> result = Mes.MonthsYear();
        //assertNotNull:not expected needed.
        assertNotNull(result);//list is an object that can be null
        assertEquals(12, result.size());
        assertEquals("August", result.get(7));

    }
}