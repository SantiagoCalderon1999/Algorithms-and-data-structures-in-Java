public class Utils {
    /**
     * Swaps elements in an array
     * @param array array to swap elements
     * @param i First element to be swapped
     * @param j Second element to be swapped
     */
    public static void swap(int[] array, int i, int j){

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

}
