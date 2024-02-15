package org.example.Task4_random;

public class RandomAlgorithm {
    private long a, c, m, sp;

    public RandomAlgorithm(long a, long m, long c) {
        this.a = a;
        this.m = m;
        this.c = c;
    }

    public RandomAlgorithm sp(long sp) {
        this.sp = sp;
        return this;
    }

    public long next() {

        return 1l * (a * sp + c) % m;
    }
}