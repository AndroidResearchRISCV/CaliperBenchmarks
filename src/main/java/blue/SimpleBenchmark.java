package blue;

import com.google.caliper.Benchmark;

public class SimpleBenchmark {
    @Benchmark
    void simpleBenchmark() {
        System.out.println("Hello, Benchmark!");
    }
}
