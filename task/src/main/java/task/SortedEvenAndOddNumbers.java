package task;

import java.util.Arrays;


public class SortedEvenAndOddNumbers {

    public static int[] getSortedEvenNumbers(int[] array){

        return Arrays.stream(array)
                .filter(l -> l % 2 == 0)
                .sorted()
                .toArray();
    }

    public static int[] getSortedOddNumbers(int[] array){

        return Arrays.stream(array)
                .filter(l -> l % 2 == 1)
                .sorted()
                .toArray();
    }
}
