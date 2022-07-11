package nivel2.ejercicio1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class HamcrestTest {
    @Test
    void hamcrestTest() {
        String expectedString = "Grey";
        String actualString = "Stupid";
        //in the left  result of the code  I am testing(actual)
        //assertThat(actualString, is(expectedString));


        var numbers = List.of(1, 2, 4, 3);
        assertThat(numbers, containsInAnyOrder(is(1), is(2), is(3), is(4)));
        assertThat(numbers, hasItem(5));
        //assertThat(numbers, contains(is(1), is(2), is(3), is(4))); // fails
    }
}
