public class SelectionSort {
    public static void main(String[] args) {

        // The time complexity of the selection sort is O(n^2)
        // as it includes two for loops.
        // It usually performs better than BubbleSort
        // However both of them have the "same" time complexity
        // given that in a worst case scenario,
        // selection sort may perform worse than bubble sort.

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
            lastUnsortedIndex--){
            int largest = 0;
            for (int i = 0; i <= lastUnsortedIndex; i++){
                if (intArray[i] > intArray[largest]){
                    largest = i;
                }
            }
            Utils.swap(intArray, largest, lastUnsortedIndex);
        }

        Logger.printArray(intArray);

    }
}