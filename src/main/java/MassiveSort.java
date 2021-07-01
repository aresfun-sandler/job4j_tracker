public class MassiveSort {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int z = 0;
        while (z < rsl.length) {
            if (i < left.length && left[i] <= right[j]) {
                rsl[z++] = left[i++];
            } else {
                rsl[z++] = right[j++];
            }
        }
        return rsl;
    }
}