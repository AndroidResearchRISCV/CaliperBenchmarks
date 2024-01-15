package blue;

public class RotationBenchmark {
    public int xi = 10;
    public int yi = 24;

    public void xorRotateRight(int reps) {
        int x = xi;
        int y = yi;
        for (int rep = 0; rep < reps; ++rep) {
            y = x ^ ((y >>> 5) | (y << -5));
        }
    }

    public void bicRotateRight(int reps) {
        int x = xi;
        int y = yi;
        for (int rep = 0; rep < reps; ++rep) {
            y = x & (-1 ^ ((y >>> 5) | (y << -5)));
        }
    }

    public void eonRotateRight(int reps) {
        int x = xi;
        int y = yi;
        for (int rep = 0; rep < reps; ++rep) {
            y = x ^ (-1 ^ ((y >>> 5) | (y << -5)));
        }
    }

    public void ornRotateRight(int reps) {
        int x = xi;
        int y = yi;
        for (int rep = 0; rep < reps; ++rep) {
            y = x | (-1 ^ ((y >>> 5) | (y << -5)));
        }
    }

    public void andRotateRight(int reps) {
        int x = xi;
        int y = yi;
        for (int rep = 0; rep < reps; ++rep) {
            y = x & ((y >>> 5) | (y << -5));
        }
    }
}
