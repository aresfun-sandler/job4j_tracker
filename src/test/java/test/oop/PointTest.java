package test.oop;

import junit.framework.TestCase;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import ru.job4j.oop.Point;

import org.junit.Test;

public class PointTest extends TestCase {

    @Test
    public void testDistance() {
        Point a = new Point(2, 4, 8);
        Point b = new Point(6, 2, 1);
        double rsl = a.distance(b);
        assertThat(rsl, closeTo(8.3, 0.1));
    }
}