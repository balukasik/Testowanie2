
public interface Means {

    public double median(double[] numbers);

    public double maximum(double[] numbers);

    public double minimum(double[] numbers);

    public double arithmeticMean(double[] numbers);

    public double geometricMean(double[] numbers);

    public double harmonicMean(double[] numbers);

    public double powerMean(double[] numbers);

    public double quadraticMean(double[] numbers);

    public double logarithmicMean(double[] numbers);

    public double truncatedMean(double[] numbers);

    public double winsorizedMean(double[] numbers);
    
    public static Means getInstance() {
    	return new MeansImpl();
    }
}
