import static org.junit.Assert.*;

public class MeansTest {
    private Means mean = Means.getInstance();
    private double[] numbers = {108, 3, 18, 2, 9};

    @org.junit.Test
    public void medianTest() {
        double median = mean.median(numbers);

        assertEquals(9, median);
    }

    @org.junit.Test
    public void maximumTest() {
        double maximum = mean.maximum(numbers);

        assertEquals(108, maximum);
    }

    @org.junit.Test
    public void minimumTest() {
        double minimum = mean.minimum(numbers);

        assertEquals(2, minimum);
    }

    @org.junit.Test
    public void arithmeticMeanTest() {
        double arithmeticMean = mean.arithmeticMean(numbers);

        assertEquals(28, arithmeticMean);
    }

    @org.junit.Test
    public void geometricMeanTest() {
        double geometricMean = mean.geometricMean(numbers);

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