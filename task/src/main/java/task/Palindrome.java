package task;

import java.util.List;
import java.util.stream.Collectors;

public class Palindrome {

    public static List<String> receivePalindromes(List<String> strings){
        return strings.stream()
                .filter(s -> !s.isBlank())
                .filter(s -> s.equalsIgnoreCase(new StringBuilder(s).reverse().toString()))
                .collect(Collectors.toList());
    }
}
