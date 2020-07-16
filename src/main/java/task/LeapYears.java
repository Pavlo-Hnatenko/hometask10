package task;

import java.time.Year;
import java.util.*;
import java.util.stream.Collectors;

public class LeapYears {

    public static List<Year> leapYearsSortedListFromReferencePointToNowadays(int yearsCount) {

        List<Year> yearList;
        yearList = yearsList(yearsCount);
        System.out.println("Years list: " + yearList);

        return yearList.stream()
                .distinct()
                .filter(Year::isLeap)
                .sorted(Year::compareTo)
                .collect(Collectors.toList());

    }

    private static List<Year> yearsList(int yearsCount) {

        Random random = new Random();
        List<Year> years = new ArrayList<>();

        for (int i = 0; i < yearsCount; i++) {
            years.add(Year.of(random.nextInt(Year.now().getValue())));
        }

        return years;
    }
}
