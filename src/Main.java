import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    static int[] input;
    static FileWriter pw;
    static Random rand;

    static ArrayList<int[]> arrayStore = new ArrayList<int[]>();

    public static void main(String[] args) {
        try {
            pw = new FileWriter("W10-StatsMS.csv",true);
            //pw.append("Array Size, MS Duration, IS Duration, MSE Duration, ISE Duration");
            rand = new Random();
            for (int i = 1; i < 100; i = i + 5) {
                //pw.append(i +",");
                input = new int[i];
                for (int k = 0; k < i; k++) {
                    input[k] = rand.nextInt(100) + 1;
                }
                arrayStore.add(input);
            }
            //pw.append('\n');
            //pw.append('\n');
            for (int j = 0; j < arrayStore.size(); j++) {

                MergeSort MS = new MergeSort(input);
                final long startTimeMS = System.nanoTime();
                MS.mergeSort(0, input.length-1);
                final long durationMS = System.nanoTime() - startTimeMS;

                InsertionSort IS = new InsertionSort(input);
                final long startTimeIS = System.nanoTime();
                IS.sort();
                final long durationIS = System.nanoTime() - startTimeIS;

                MergeSortExtension MSE = new MergeSortExtension(input);
                final long startTimeMSE = System.nanoTime();
                MSE.mergeSort(0, input.length-1);
                final long durationMSE = System.nanoTime() - startTimeMSE;

                InsertionSortExtension ISE = new InsertionSortExtension(input);
                final long startTimeISE = System.nanoTime();
                ISE.sort();
                final long durationISE = System.nanoTime() - startTimeISE;

                //pw.append(durationISE +",");
                pw.append(arrayStore.get(j).length +"," +durationMS +"," +durationIS +"," +durationMSE +"," +durationISE +"\n");
                System.out.println(arrayStore.get(j).length +", MS: " +durationMS +", IS: " +durationIS +", MSE: " +durationMSE +", ISE: " +durationISE);
            }
            pw.append('\n');
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
