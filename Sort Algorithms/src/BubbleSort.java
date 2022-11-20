public class BubbleSort {
    public static void main(String[] args) {

        // The time complexity of the bubble sort is O(n^2)
        // as it includes two for loops.
        // In a strictly mathematical sense, it won't reach
        // a time complexity of n^2. However, O(n^2) is
        // the closest approximation.

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    Utils.swap(intArray, i, i + 1);
                }
            }
        }

        Logger.printArray(intArray);
    }
}