package Benchmark;

import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Fork(value = 1, warmups = 1)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)

public class BenchmarkTest {

    @State(Scope.Benchmark)
    public static class ExecutionPlan{
        public Means mean = Means.getInstance();
        public double[] numbers = {108, 3, 18, 2, 9};
        public double a = 12;
        public double b = 13;
    }

    @Benchmark
    public void medianTest(ExecutionPlan plan)
    {
        plan.mean.median(plan.numbers);
    }

    @Benchmark
    public void maximumTest(ExecutionPlan plan)
    {
        plan.mean.maximum(plan.numbers);
    }

    @Benchmark
    public void minimumTest(ExecutionPlan plan)
    {
        plan.mean.minimum(plan.numbers);
    }

    @Benchmark
    public void arithmeticMeanTest(ExecutionPlan plan)
    {
        plan.mean.arithmeticMean(plan.numbers);
    }

    @Benchmark
    public void geometricMeanTest(ExecutionPlan plan)
    {
        plan.mean.geometricMean(plan.numbers);
    }

    @Benchmark
    public void harmonicMeanTest(ExecutionPlan plan)
    {
        plan.mean.harmonicMean(plan.numbers);
    }

    @Benchmark
    public void powerMeanTest(ExecutionPlan plan)
    {
        plan.mean.powerMean(plan.numbers, 3);
    }

    @Benchmark
    public void quadraticMeanTest(ExecutionPlan plan)
    {
        plan.mean.quadraticMean(plan.numbers);
    }

    @Benchmark
    public void logarithmicMeanTest(ExecutionPlan plan)
    {
        plan.mean.logarithmicMean(plan.a, plan.b);
    }

    @Benchmark
    public void truncatedMeanTest(ExecutionPlan plan)
    {
      plan.mean.truncatedMean(plan.numbers, 0.2);
    }

    @Benchmark
    public void winsorizedMeanTest(ExecutionPlan plan)
    {
        plan.mean.winsorizedMean(plan.numbers, 0.2);
    }
}
