import java.util.Arrays;

public class MeansImpl implements Means {
    @Override
    public double median(double[] numbers) {
        Arrays.sort(numbers);
        if (numbers.length % 2 == 0){
            return (numbers[numbers.length / 2] + numbers[numbers.length / 2 - 1]) / 2;
        } else {
            return numbers[numbers.length / 2];
        }
    }

    @Override
    public double maximum(double[] numbers) {
        return Arrays.stream(numbers).max().getAsDouble();
    }

    @Override
    public double minimum(double[] numbers) {
        return Arrays.stream(numbers).min().getAsDouble();
    }

    @Override
    public double arithmeticMean(double[] numbers) {
        return Arrays.stream(numbers).sum() / numbers.length;
    }

    @Override
    public double geometricMean(double[] numbers) {
        double sum = 1;
        for (double number : numbers){
            sum *= number;
        }
        return Math.pow(sum, 1.0 / numbers.length);
    }

    @Override
    public double harmonicMean(double[] numbers) {
        double sum = 0;
        for (double number : numbers){
            sum += Math.pow(number, -1);
        }
        return numbers.length / sum;
    }

    @Override
    public double powerMean(double[] numbers, int k) {
        double sum = 0;
        for (double number : numbers){
            sum += Math.pow(number, k);
        }
        return Math.pow(sum / numbers.length, 1.0 / k);
    }

    @Override
    public double quadraticMean(double[] numbers) {
        double sum = 0;
        for (double number : numbers){
            sum += Math.pow(number, 2);
        }
        return Math.sqrt(sum / numbers.length);
    }

    @Override
    public double logarithmicMean(double a, double b) {
        if (a < 0 || b < 0 || a == b){
            return -1;
        }
        return (a - b) / (Math.log(a) - Math.log(b));
    }

    @Override
    public Result truncatedMean(double[] numbers, double k) {
    	int change = (int) (numbers.length * k);
    	if (k <= 0 || k >= 05 || numbers.length <= 2 * change){
            return null;
        }
        double sum = 0;
        Arrays.sort(numbers);
        for (int i = change; i < numbers.length - change; i++){
            sum += numbers[i];
        }
        return new Result(sum / (numbers.length - 2 * change));
    }

    @Override
    public Result winsorizedMean(double[] numbers, double k) {
        if (k <= 0 || k >= 0.5){
            return null;
        }
        int change = (int) (numbers.length * k);
        if (numbers.length - change * 2 <= 2){
            return new Result(median(numbers));
        }
        Arrays.sort(numbers);
        for (int i = 0; i < change; i++){
            numbers[i] = numbers[change];
            numbers[numbers.length - 1 - i] = numbers[numbers.length - 1 - change];
        }
        return new Result(arithmeticMean(numbers));
    }
}