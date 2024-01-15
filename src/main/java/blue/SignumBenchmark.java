package blue;

public class SignumBenchmark {
    private static final float[] float_values = {
            123.4f,
            -56.7f,
            7e30f,
            -0.3e30f,
            Float.MAX_VALUE,
            -Float.MAX_VALUE,
            Float.MIN_VALUE,
            -Float.MIN_VALUE,
            0.0f,
            -0.0f,
            Float.POSITIVE_INFINITY,
            Float.NEGATIVE_INFINITY,
            Float.NaN,
            Float.MIN_NORMAL,
            -Float.MIN_NORMAL,
            0x0.0002P-126f,
            -0x0.0002P-126f
    };

    private static final double[] double_values = {
            123.4d,
            -56.7d,
            7e30d,
            -0.3e30d,
            Double.MAX_VALUE,
            -Double.MAX_VALUE,
            Double.MIN_VALUE,
            -Double.MIN_VALUE,
            0.0d,
            -0.0d,
            Double.POSITIVE_INFINITY,
            Double.NEGATIVE_INFINITY,
            Double.NaN,
            Double.MIN_NORMAL,
            -Double.MIN_NORMAL,
            0x0.00000001P-1022,
            -0x0.00000001P-1022,
    };

    public void signumFloatTest(int reps) {
        for (int rep = 0; rep < reps; ++rep) {
            for (float f : float_values) {
                Math.signum(f);
            }
        }
    }

    public void signumDoubleTest(int reps) {
        for (int rep = 0; rep < reps; ++rep) {
            for (double d : double_values) {
                Math.signum(d);
            }
        }
    }

}
