package nivel1.ejercicio2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculoDniTest {

    /* @Test
     void for33266511LetraShouldBeR() {
         //var result=CalculoDni.Letra();
         assertEquals("R", CalculoDni.Letra(33266511));
     }

     @Test
     void for77204683LetraShouldBeP() {
         //var result=CalculoDni.Letra();
         assertEquals("P", CalculoDni.Letra(77204683));
     }

     @Test
     void for61149137LetraShouldBeA() {
         assertEquals("A", CalculoDni.Letra(61149137));
     }

     @Test
     void for96435073LetraShouldBeY() {
         assertEquals("Y", CalculoDni.Letra(96435073));

     }

     @Test
     void for74580065LetraShouldBeN() {
         assertEquals("N", CalculoDni.Letra(74580065));
     }

     @Test
     void for27692751letraShouldBeS() {
         assertEquals("S", CalculoDni.Letra(27692751));
     }
     @Test
     void for49502486LetraShouldBeT() {
     assertEquals("T", CalculoDni.Letra(49502486));

    */
    //any kind of collection for return is correct like LIST.
    //STEP 1 PREPARING DATA TO BE TESTED.
    private static List<Arguments> provideLetterForDniNumber() {
        return List.of(
                Arguments.of(33266511, "R"),
                Arguments.of(77204683, "P"),
                Arguments.of(61149137, "A"),
                Arguments.of(96435073, "Y"),
                Arguments.of(74580065, "N"),
                Arguments.of(27692751, "S"),
                Arguments.of(49502486, "T"),
                Arguments.of(92360822, "K"),
                Arguments.of(11818282, "P"),
                Arguments.of(71789406, "N")
        );
    }

    @ParameterizedTest
    @MethodSource("provideLetterForDniNumber")
        //PARAMETERS ARE THE ARGUMENTS OF THE FUNCTION BELOW
    void ShouldReturnLetterForDniNumbers(int number, String expectedLetter) {
        assertEquals(expectedLetter, CalculoDni.Letra(number));
    }
}