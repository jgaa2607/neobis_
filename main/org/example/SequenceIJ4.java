package org.example;

public class SequenceIJ4 {
    public void solution() {
        double k = 0;
        for (double i = 0; i <= 2; i += 0.2) {
            for (int j = 1; j <= 3; j++) {
                System.out.printf("I = %.1f  J = %.1f%n", i, (double) j + k);
            }
            k += 0.2;
        }
    }
}
