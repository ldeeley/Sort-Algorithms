public class BubbleSort {

    public static void main(String[] args) {

        //O(n squared) time complexity - quadratic - see nested for loops
        //least efficient sort algorithm for sorting, algorithm degrades quickly
        //example of a Stable sort - original order preserved for duplicate values

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for (int i = 0; i < lastUnsortedIndex; i++){
                if (intArray[i] > intArray[i+1]){
                    swap(intArray, i, i+1);
                }
            }
        }

        for (int value : intArray) {
            System.out.println(value);
        }

    }

    public static void swap(int[] array, int i, int j){
        if (i==j) return;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

}
