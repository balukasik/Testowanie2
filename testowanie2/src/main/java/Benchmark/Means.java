package Benchmark;

public interface Means {

    public double median(double[] numbers);

    public double maximum(double[] numbers);

    public double minimum(double[] numbers);

    public double arithmeticMean(double[] numbers);

    public double geometricMean(double[] numbers);

    public double harmonicMean(double[] numbers);

    public double powerMean(double[] numbers,int k);

    public double quadraticMean(double[] numbers);

    public double logarithmicMean(double a, double b);
    
    public Result truncatedMean(double[] numbers, double k);

    public Result winsorizedMean(double[] numbers, double k);
    
    public static Means getInstance() {
    	return new MeansImpl();
    }
}
