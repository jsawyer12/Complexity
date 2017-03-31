public class InsertionSortExtension {

    private int[] input;

    public InsertionSortExtension(int[] input) {
        if (input.length < 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        else {
            this.input = input;
        }
    }

    public int[] sort() {
        for (int i = 0; i < input.length-1; i++) {
            for (int k = i+1; k < input.length; k++) {
                if (input[k] < input[i]) {
                    int previousHighestValue = input[i];
                    input[i] = input[k];
                    input[k] = previousHighestValue;
                }
            }
        }
        return input;
    }
}
