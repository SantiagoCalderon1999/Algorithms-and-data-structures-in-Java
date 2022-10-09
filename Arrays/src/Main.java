public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        // Retrieving an element when we know the index of the array will take
        // always a constant time. In this case, it only takes one step.
        // Therefore, the time complexity of this operation is O(1)
        int desiredIndex = 2;
        int value = intArray[desiredIndex];

        // When we do not know the index of the value, we must iterate
        // element by element. Thus, a simple search algorithm has a
        // time complexity of O(n). See the following example:
        int index = -1;
        for (int i = 0; i< intArray.length; i++){
            if (intArray[i] == 7) {
                index = i;
                break;
            }
        }

        System.out.println("index = " + index);


    }
}