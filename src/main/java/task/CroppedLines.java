package task;

import java.util.List;
import java.util.stream.Collectors;

public class CroppedLines {

    public static void cropLines(List<String> strings, String regex){

        System.out.println("strings before cropping: " + strings);

        strings = strings.stream()
                .map(s -> s.replaceAll(regex, ""))
                .collect(Collectors.toList());

        System.out.println("strings after cropping: " + strings);

    }
}
