package task;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EmployeeBirthdays {

    public static Map<Month, Integer> receiveMonthBirthdaysCount(Collection<LocalDate> dates) {

        Map<Month, Integer> monthBirthdaysCount = new HashMap<>();
        for (Month month : Month.values()) {
            monthBirthdaysCount.put(month, 0);
        }

        dates.forEach(localDate -> {
            for (Map.Entry<Month, Integer> entry : monthBirthdaysCount.entrySet()) {
                if (entry.getKey().equals(localDate.getMonth())) {
                    entry.setValue(entry.getValue() + 1);
                }
            }
        });

        return monthBirthdaysCount;
    }
}
