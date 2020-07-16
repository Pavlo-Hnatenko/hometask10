package util;

import org.apache.commons.lang.RandomStringUtils;

import java.util.ArrayList;

public class Util {

    public static ArrayList<String> generateStringsList(int count) {

        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            strings.add(RandomStringUtils.randomAlphabetic(15));
        }

        return strings;
    }
}
