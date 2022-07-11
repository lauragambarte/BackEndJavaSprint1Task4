package nivel1.ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayofStringTest {
//asserting that the exception is thrown and that the message is correct
    //lambdas:short way to write a fx. after ->comes code to be tested
    @Test
    public void whenExceptionThrown_thenAssertionSucceeds() {
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            ArrayofString.names();
        });
//message I got before creating the test is Index 6 out of bounds for length 6
        String expectedMessage = "Index 6 out of bounds for length 6";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
    }
