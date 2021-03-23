package test.oop;

import junit.framework.TestCase;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import ru.job4j.oop.Point;

import org.junit.Test;

public class PointTest extends TestCase {

    @Test
    public void testDistance() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double rsl = a.distance(b);
        assertThat(rsl, is(2.0));
    }
}