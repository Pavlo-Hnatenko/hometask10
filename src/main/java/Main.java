import task.CroppedLines;
import task.DoublesStatistic;
import task.LeapYears;
import task.Palindrome;
import util.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        System.out.println("\nTask 1: calculate statistic for doubles array  \n");
        DoublesStatistic.calculateStatisticForDoublesArray(10);
        System.out.println("\nTask 2: leap years list from reference point to nowadays \n");
        System.out.println("Leap years from the years list: " + LeapYears.leapYearsSortedListFromReferencePointToNowadays(20));
        System.out.println("\nTask 3 \n");
        CroppedLines.cropLines(Util.generateStringsList(10), "[akjhsvkfkbvbxkfublUCsh]");
        System.out.println("\nTask 4 \n");
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "aaa", "Bbb", "skjkrlgjs", "bbb");
        System.out.println(Palindrome.receivePalindromes(strings));

    }
}
