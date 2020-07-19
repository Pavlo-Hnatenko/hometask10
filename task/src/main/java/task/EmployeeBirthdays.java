package task;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeBirthdays {

    public static Map<Month, Long> receiveMonthBirthdaysCount(Collection<LocalDate> dates) {

        return dates.stream()
                .collect(Collectors.groupingBy(LocalDate::getMonth, Collectors.counting()));

    }
}
