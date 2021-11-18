package java;

import static org.junit.Assert.*;

public class meansTest {
    private Means mean = new Means();
    private double[] numbers = {108, 3, 18, 2, 9};

    @org.junit.Test
    public void medianTest() {
        double median = mean.getMedian(numbers);

        assertEquals(9, median);
    }

    @org.junit.Test
    public void maximumTest() {
        double maximum = mean.getMaximum(numbers);

        assertEquals(108, maximum);
    }

    @org.junit.Test
    public void minimumTest() {
        double minimum = mean.getMinimum(numbers);

        assertEquals(2, minimum);
    }

    @org.junit.Test
    public void arithmeticMeanTest() {
        double arithmeticMean = mean.getArithmeticMean(numbers);

        assertEquals(28, arithmeticMean);
    }

    @org.junit.Test
    public void geometricMeanTest() {
        double geometricMean = mean.getGeometricMean(numbers);

        assertEquals(18, geometricMean);
    }

    @org.junit.Test
    public void harmonicMeanTest() {
        fail();
        //TODO
    }

    @org.junit.Test
    public void powerMeanTest() {
        fail();
        //TODO
    }

    @org.junit.Test
    public void quadraticMeanTest() {
        fail();
        //TODO
    }

    @org.junit.Test
    public void logarithmicMeanTest() {
        fail();
        //TODO
    }

    @org.junit.Test
    public void truncatedMeanTest() {
        fail();
        //TODO
    }

    @org.junit.Test
    public void winsorizedMeanTest() {
        fail();
        //TODO
    }
}