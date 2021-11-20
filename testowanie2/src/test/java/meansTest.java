import static org.junit.Assert.assertEquals;

import java.text.DecimalFormat;

public class MeansTest {
	private DecimalFormat df = new DecimalFormat("#.#####");
    private Means mean = Means.getInstance();
    private double[][] numbers = {
        new double[]{108, 3, 18, 2, 9},
        new double[]{1, 1, 1, 1},
        new double[]{5},
        new double[]{0},
        new double[]{0, 0}
	};

    @org.junit.Test
    public void medianTest() {
    	String[] results = {"9","1","5","0","0"};
        int i = 0;
        for(double[] array : numbers){
            assertEquals(results[i], df.format(mean.median(array)));
            i++;
        }
    }

    @org.junit.Test
    public void maximumTest() {
    	String[] results = {"108","1","5","0","0"};
        int i = 0;
        for(double[] array : numbers){
            assertEquals(results[i], df.format(mean.maximum(array)));
            i++;
        }
    }

    @org.junit.Test
    public void minimumTest() {
    	String[] results = {"2","1","5","0","0"};
        int i = 0;
        for(double[] array : numbers){
            assertEquals(results[i], df.format(mean.minimum(array)));
            i++;
        }
    }

    @org.junit.Test
    public void arithmeticMeanTest() {
    	String[] results = {"28","1","5","0","0"};
        int i = 0;
        for(double[] array : numbers){
            assertEquals(results[i], df.format(mean.arithmeticMean(array)));
            i++;
        }
    }

    @org.junit.Test
    public void geometricMeanTest() {
    	String[] results = {"1.24376","1","5","0","0"};
        int i = 0;
        for(double[] array : numbers){
            assertEquals(results[i], df.format(mean.geometricMean(array)));
            i++;
        }
    }

    @org.junit.Test
    public void harmonicMeanTest() {
    	String[] results = {"7.2","1","5","0","0"}; // 0 -> data contains '0' -> wrong input
        int i = 0;
        for(double[] array : numbers){
            assertEquals(results[i], df.format(mean.harmonicMean(array)));
            i++;
        }
    }

    @org.junit.Test
    public void powerMeanTest() {
    	String[] results = {"63.26882","1","1.70997","0","0"};
        int i = 0;
        for(double[] array : numbers){
            assertEquals(results[i], df.format(mean.powerMean(array,3)));
            i++;
        }
    }

    @org.junit.Test
    public void quadraticMeanTest() {
    	String[] results = {"49.15689","1","2.23606","0","0"};
        int i = 0;
        for(double[] array : numbers){
            assertEquals(results[i], df.format(mean.quadraticMean(array)));
            i++;
        }
    }

    @org.junit.Test
    public void logarithmicMeanTest() {
    	assertEquals("12.49333", df.format(mean.logarithmicMean(12,13)));
    	assertEquals("-1", df.format(mean.logarithmicMean(-1,13))); //-1 -> wrong input
    	assertEquals("12", df.format(mean.logarithmicMean(12,12)));
    }

    @org.junit.Test
    public void truncatedMeanTest() {
    	String[] results = {"7.66666","1","5","0","0"};
        int i = 0;
        for(double[] array : numbers){
            assertEquals(results[i], df.format(mean.truncatedMean(array,0.2)));
            i++;
        }
    }

    @org.junit.Test
    public void winsorizedMeanTest() {
    	String[] results = {"10.2","1","5","0","0"};
        int i = 0;
        for(double[] array : numbers){
            assertEquals(results[i], df.format(mean.winsorizedMean(array,0.2)));
            i++;
        }
    }
}