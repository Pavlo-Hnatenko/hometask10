package task;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.Random;

public class DoublesStatistic {

    public static void calculateStatisticForDoublesArray(int arraySize) {

        double[] doubles = createDoubleArray(arraySize);
        System.out.println("Our doubles array: " + Arrays.toString(doubles));

        DoubleSummaryStatistics doubleSummaryStatistics = Arrays.stream(doubles).summaryStatistics();
        System.out.println("Max: " + doubleSummaryStatistics.getMax());
        System.out.println("Min: " + doubleSummaryStatistics.getMin());
        System.out.println("Average: " + doubleSummaryStatistics.getAverage());
        System.out.println("Sum: " + doubleSummaryStatistics.getSum());
    }

    private static double[] createDoubleArray(int size) {
        Random random = new Random();
        double[] doubles = new double[size];

        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = random.nextDouble();
        }

        return doubles;
    }


}
