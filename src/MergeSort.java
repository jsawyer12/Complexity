public class MergeSort {

    private int[] input;
    private int[] workArray;

    public MergeSort(int[] input) {
        if (input.length < 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        else {
            this.input = input;
            workArray = new int[input.length];
        }
    }

    public int[] getInput() {
        return this.input;
    }

    public  void mergeSort(int lowerIndex, int upperIndex) {
        if (lowerIndex < upperIndex) {
            int middle = lowerIndex + (upperIndex - lowerIndex) / 2;
            mergeSort(lowerIndex, middle);
            mergeSort(middle+1, upperIndex);
            merge(lowerIndex, middle, upperIndex);
        }
    }

    public  void merge(int lowerIndex, int middle, int upperIndex) {
        for (int i = lowerIndex; i <= upperIndex; i++) {
            workArray[i] = input[i];
        }
        int i = lowerIndex, k = i;
        int j = middle + 1;
        while (i <= middle && j <= upperIndex) {
            if (workArray[i] <= workArray[j]) {
                input[k] = workArray[i];
                i++;
            } else {
                input[k] = workArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            input[k] = workArray[i];
            k++;
            i++;
        }
    }
}
