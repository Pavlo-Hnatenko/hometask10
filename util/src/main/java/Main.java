import task.*;
import util.Util;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n------------Task 1: calculate statistic for doubles array------------\n");
        DoublesStatistic.calculateStatisticForDoublesArray(10);

        System.out.println("\n------------Task 2: leap years list from reference point to nowadays------------\n");
        System.out.println("Leap years from the list: " + LeapYears.leapYearsSortedListFromReferencePointToNowadays(20));

        System.out.println("\n------------Task 3: crop all parts that match regex------------\n");
        CroppedLines.cropLines(Util.generateStringsList(10), "[akjhsvkfkbvbxkfublUCsh]");

        System.out.println("\n------------Task 4: find all palindrome (with ignoring of case)------------\n");
        List<String> strings = Util.generateStringsList(10);
        Collections.addAll(strings, "aaa", " ", "Bbbbb", "   ", "skjkrlgjs", "  ", "XyYx");
        System.out.println("list of all strings: " + strings);
        System.out.println("list of palindrome strings: " + Palindrome.receivePalindromes(strings));

        System.out.println("\n------------Task 5: receive limited list of BigIntegers------------\n");
        System.out.println(EndlessBigIntegerSequence.primeList(100));

        System.out.println("\n------------Task 6: receive map of birthdays------------\n");
        Collection<LocalDate> dates = Util.generateLocalDateList(10);
        dates.forEach(localDate -> System.out.print(localDate.getMonth() + " " + localDate.getDayOfMonth() + ", "));
        System.out.println();
        System.out.println(EmployeeBirthdays.receiveMonthBirthdaysCount(dates));

        System.out.println("\n------------Task 7: receive sorted arrays of even and odd numbers from the array------------\n");
        int[] array = Util.generateLongArray(100);
        System.out.println("Sorted even array: " + Arrays.toString(SortedEvenAndOddNumbers.getSortedEvenNumbers(array)));
        System.out.println("Sorted odd array: " + Arrays.toString(SortedEvenAndOddNumbers.getSortedOddNumbers(array)));

        System.out.println("\n------------Task 8: Unite all UnaryOperator in one UnaryOperator------------\n");
        int unaryOperatorDisplay = 44;
        System.out.println("Apply list of UnaryOperator<Integer> to the Integer " + unaryOperatorDisplay + ": "
                + UnaryOperatorUnifier.useAllUnaryOperator(Util.generateUnaryOperatorList()).apply(unaryOperatorDisplay));

    }
}
