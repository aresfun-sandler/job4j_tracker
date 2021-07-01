import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MassiveSortTest {

    @Test
    public void testMerge() {
        int[] expect = {1, 1, 2, 2, 3, 3, 4, 4};
        int[] result = MassiveSort.merge(
                new int[] {1, 2, 3, 4},
                new int[] {1, 2, 3, 4}
        );
        assertThat(result, is(expect));
    }
}