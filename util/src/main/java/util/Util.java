package util;

import org.apache.commons.lang.RandomStringUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class Util {

    public static ArrayList<String> generateStringsList(int count) {

        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            strings.add(RandomStringUtils.randomAlphabetic(5));
        }

        return strings;
    }

    public static Collection<LocalDate> generateLocalDateList(int count) {

        Collection<LocalDate> dates = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            dates.add(LocalDate.now().minusDays(i * 43));
        }

        return dates;
    }

    public static int[] generateLongArray(int count) {

        int[] array = new int[count];
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            array[i] = random.nextInt();
        }

        return array;
    }

    public static List<UnaryOperator<Integer>> generateUnaryOperatorList() {

        List<UnaryOperator<Integer>> unaryOperators = new ArrayList<>();
        unaryOperators.add(integer -> integer * 2);
        unaryOperators.add(integer -> integer / 5);
        unaryOperators.add(integer -> integer - 10);
        unaryOperators.add(integer -> integer + 20);

        return unaryOperators;
    }
}
