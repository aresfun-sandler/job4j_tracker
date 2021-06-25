public class MassiveSort {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        while (i + j < rsl.length) {
            if (j == right.length || i != left.length
                    && left[i] < right[j]) {
                rsl[i + j] = left[i++];
            } else {
                rsl[i + j] = right[j++];
            }
        }
        return rsl;
    }
}
