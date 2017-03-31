public class MergeSortExtension {

    static int[] input;

    public MergeSortExtension(int[] input) {
        if (input.length < 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        else {
            this.input = input;
        }
    }

    public int[] getInput() {
        return this.input;
    }

    public static void mergeSort(int lowerIndex, int upperIndex) {
        if (lowerIndex < upperIndex) {
            int middle = lowerIndex + (upperIndex - lowerIndex) / 2;
            mergeSort(lowerIndex, middle);
            mergeSort(middle+1, upperIndex);
            merge(lowerIndex, upperIndex);
        }
    }

    public static void merge(int lowerIndex, int upperIndex) {
        for (int i = lowerIndex; i < upperIndex; i++) {
            for (int k = i+1; k <= upperIndex; k++) {
                if (input[k] < input[i]) {
                    int previousHighestValue = input[i];
                    input[i] = input[k];
                    input[k] = previousHighestValue;
                }
            }
        }
    }
}
