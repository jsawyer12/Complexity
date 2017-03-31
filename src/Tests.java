import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Tests {

    /**
     * Standard input to confirm sort returns proper output
     */
    int[] input = {56, 43, 40, 84, 16, 23};
    int[] correctOutput = {16, 23, 40, 43, 56, 84};

    /**
     * to test sorters when input has nothing in it
     */
    int[] input2 = {};

    /**
     * to test sort methods when input is all 0
     */
    int[] input3 = {0, 0, 0, 0, 0, 0, 0, 0};

    /**
     * odd-sized input to confirm sort returns proper output
     */
    int[] input4 = {43, 76, 23, 12, 5, 3, 87};
    int[] correctOutput4 = {3, 5, 12, 23, 43, 76, 87};

    public Tests() {

    }

    @Test
    public void mergeSortTest() {
        MergeSort MS = new MergeSort(input);
        MS.mergeSort(0, (input.length-1));
        assertEquals(Arrays.toString(correctOutput), Arrays.toString(MS.getInput()));
    }

    @Test
    public void mergeSortTest2() {
        MergeSort MS = new MergeSort(input4);
        MS.mergeSort(0, (input4.length-1));
        assertEquals(Arrays.toString(correctOutput4), Arrays.toString(MS.getInput()));
    }

    @Test
    public void mergeSortWhenNothing() {
        try {
            MergeSort MS = new MergeSort(input2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown in correct place");
        }
    }

    @Test
    public void mergeSortWhenZerosTest() {
        MergeSort MS = new MergeSort(input3);
        MS.mergeSort(0, (input.length-1));
        System.out.println("Program runs smoothly when input doesn\'t need to be sorted");
    }

    @Test
    public void mergeSortExtensionTest() {
        MergeSortExtension MSE = new MergeSortExtension(input);
        MSE.mergeSort(0, input.length-1);
        assertEquals(Arrays.toString(correctOutput), Arrays.toString(MSE.getInput()));
    }

    @Test
    public void mergeSortExtensionWhenNothing() {
        try {
            MergeSortExtension MSE = new MergeSortExtension(input2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown in correct place");
        }
    }

    @Test
    public void mergeSortExtensionWhenZerosTest() {
        MergeSortExtension MSE = new MergeSortExtension(input3);
        MSE.mergeSort(0, input.length-1);
        System.out.println("Program runs smoothly when input doesn\'t need to be sorted");
    }

    @Test
    public void mergeSortExtensionTest2() {
        MergeSortExtension MSE = new MergeSortExtension(input4);
        MSE.mergeSort(0, input4.length-1);
        assertEquals(Arrays.toString(correctOutput4), Arrays.toString(MSE.getInput()));
    }

    @Test
    public void insertionSortTest() {
        InsertionSort IS = new InsertionSort(input);
        assertEquals(Arrays.toString(correctOutput), Arrays.toString(IS.sort()));
    }

    @Test
    public void InsertionSortWhenNothing() {
        try {
            InsertionSort IS = new InsertionSort(input2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown in correct place");
        }
    }

    @Test
    public void insertionSortWhenZerosTest() {
        InsertionSort IS = new InsertionSort(input3);
        IS.sort();
        System.out.println("Program runs smoothly when input doesn\'t need to be sorted");
    }

    @Test
    public void insertionSortTest2() {
        InsertionSort IS = new InsertionSort(input4);
        assertEquals(Arrays.toString(correctOutput4), Arrays.toString(IS.sort()));
    }

    @Test
    public void insertionSortExtensionTest() {
        InsertionSortExtension ISE = new InsertionSortExtension(input);
        assertEquals(Arrays.toString(correctOutput), Arrays.toString(ISE.sort()));
    }

    @Test
    public void InsertionSortExtensionWhenNothing() {
        try {
            InsertionSortExtension ISE = new InsertionSortExtension(input2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown in correct place");
        }
    }

    @Test
    public void insertionSortExtensionWhenZerosTest() {
        InsertionSortExtension ISE = new InsertionSortExtension(input3);
        ISE.sort();
        System.out.println("Program runs smoothly when input doesn\'t need to be sorted");
    }

    @Test
    public void insertionSortExtensionTest2() {
        InsertionSortExtension ISE = new InsertionSortExtension(input4);
        assertEquals(Arrays.toString(correctOutput4), Arrays.toString(ISE.sort()));
    }

}
