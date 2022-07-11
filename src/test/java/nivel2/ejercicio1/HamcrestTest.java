package nivel2.ejercicio1;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class HamcrestTest {
    @Test
    public void hamcrestTest() {
        String actualString = "Mordor";
//matcher:equalto,contain
        assertThat(actualString, new MyMatcher(equalTo(8)));
    }
}
