public class InsertionSort {

    public static void main(String[] args) {

        //O(n squared) time complexity - quadratic - see nested for loops
        //not as much swapping as the bubble sort but algorithm degrades quickly
        //example of an stable sort - original order  preserved for duplicate values

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {

            int newElement = intArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;
        }

        for (int value : intArray) {
            System.out.println(value);
        }
    }
}
