public class ShellSort {

    public static void main(String[] args) {

        //O(n squared) time complexity - but it can perform much better than that depending on the gap size
        //eventually this kind of sort ends in a regular insertion sort - i.e. gap size = 1.
        //example of an UNstable sort - original order  not preserved for duplicate values due to initial shell sort prior to insertion sort

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < intArray.length; i++) {

                int newElement = intArray[i];
                int j = i;

                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }
                intArray[j] = newElement;
            }

        }

        for (int value : intArray) {
            System.out.println(value);
        }
    }
}
