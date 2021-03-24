package test.oop;

import ru.job4j.oop.Max;
import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class MaxTest extends TestCase {

    @Test
    public void testMaxTwo() {
        Max one = new Max();
        int rsl = one.max(1, 2);
        assertThat(rsl, is(2));
    }

    @Test
    public void testMaxThree() {
        Max one = new Max();
        int rsl = one.max(8, 2, 1);
        assertThat(rsl, is(8));
    }

    @Test
    public void testMaxFour() {
        Max one = new Max();
        int rsl = one.max(1, 2, 8, -10);
        assertThat(rsl, is(8));
    }
}