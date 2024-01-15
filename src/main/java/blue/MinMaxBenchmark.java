package blue;

import com.google.caliper.BeforeExperiment;

import java.util.Random;

public class MinMaxBenchmark {
    private static final int COUNT = 100000;

    private final float[] floats_a = new float[COUNT];
    private final float[] floats_b = new float[COUNT];
    private final double[] doubles_a = new double[COUNT];
    private final double[] doubles_b = new double[COUNT];

    private final Random r = new Random();
    @BeforeExperiment
    protected void setUp() throws Exception {
        for (int i=0; i<COUNT; i++) {
            floats_a[i] = r.nextFloat();
            floats_b[i] = r.nextFloat();
            doubles_a[i] = r.nextDouble();
            doubles_b[i] = r.nextDouble();
        }
    }

    // Float
    private float fAddBench(float a, float b) {
        return Math.max(a, b) + Math.min(a, b);
    }

    private float fMulBench(float a, float b) {
        return Math.max(a, b) * Math.min(a, b);
    }

    private float fMaxBench(float a, float b) {
        return Math.max(Math.max(a, b), Math.min(a, b));
    }

    private float fMinBench(float a, float b) {
        return Math.min(Math.max(a, b), Math.min(a, b));
    }

    public void fAdd(int reps) {
        float sum = 0;
        for (int rep = 0; rep < reps; ++rep)
            sum += fAddBench(floats_a[rep], floats_b[rep]);
    }

    public void fMul(int reps) {
        float sum = 0;
        for (int rep = 0; rep < reps; ++rep)
            sum += fMulBench(floats_a[rep], floats_b[rep]);
    }

    public void fMax(int reps) {
        float sum = 0;
        for (int rep = 0; rep < reps; ++rep)
            sum += fMaxBench(floats_a[rep], floats_b[rep]);
    }

    public void fMin(int reps) {
        float sum = 0;
        for (int rep = 0; rep < reps; ++rep)
            sum += fMinBench(floats_a[rep], floats_b[rep]);
    }

    // Double
    private double dAddBench(double a, double b) {
        return Math.max(a, b) + Math.min(a, b);
    }

    private double dMulBench(double a, double b) {
        return Math.max(a, b) * Math.min(a, b);
    }

    private double dMaxBench(double a, double b) {
        return Math.max(Math.max(a, b), Math.min(a, b));
    }

    private double dMinBench(double a, double b) {
        return Math.min(Math.max(a, b), Math.min(a, b));
    }

    public void dAdd(int reps) {
        double sum = 0;
        for (int rep = 0; rep < reps; ++rep)
            sum += dAddBench(doubles_a[rep], doubles_b[rep]);
    }

    public void dMul(int reps) {
        double sum = 0;
        for (int rep = 0; rep < reps; ++rep)
            sum += dMulBench(doubles_a[rep], doubles_b[rep]);
    }

    public void dMax(int reps) {
        double sum = 0;
        for (int rep = 0; rep < reps; ++rep)
            sum += dMaxBench(doubles_a[rep], doubles_b[rep]);
    }

    public void dMin(int reps) {
        double sum = 0;
        for (int rep = 0; rep < reps; ++rep)
            sum += dMinBench(doubles_a[rep], doubles_b[rep]);
    }
}
