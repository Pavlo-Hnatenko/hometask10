package task;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EndlessBigIntegerSequence {

    public static List<BigInteger> primeList(int n) {

        return Stream.iterate(BigInteger.ONE, i -> i.add(BigInteger.ONE))
                .filter(bigInteger -> bigInteger.isProbablePrime((int) (1 - Math.pow(2, -100))))
                .limit(n).collect(Collectors.toList());
    }
}
