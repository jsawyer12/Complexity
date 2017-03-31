public class InsertionSort {

    private int[] input;

    public InsertionSort(int[] input) {
        if (input.length < 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        else {
            this.input = input;
        }
    }

    public int[] sort() {
        int[] array = input;
        for (int i = 1; i < array.length; i++) {
            for (int k = i; k > 0; k--) {
                if (array[k-1] > array[k]) {
                    int tempInt = array[k];
                    array[k] = array[k-1];
                    array[k-1] = tempInt;
                }
            }
        }
        return array;
    }
}
