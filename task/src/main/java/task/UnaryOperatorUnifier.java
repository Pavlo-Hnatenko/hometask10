package task;

import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorUnifier {

    public static <T> UnaryOperator<T> useAllUnaryOperator(List<UnaryOperator<T>> unaryOperators) {

        return unaryOperators.stream()
                .reduce(s -> s, (a, b) -> s -> b.apply(a.apply(s)));

    }
}
