package org.example;

import java.util.Scanner;

public class WeightedAverages {
    public void solution() {
        System.out.print("Введите количество линий: ");
        int number = new Scanner(System.in).nextInt();
        for (int i = 1; i <= number; i++) {
            double num1 = new Scanner(System.in).nextDouble();
            double num2 = new Scanner(System.in).nextDouble();
            double num3 = new Scanner(System.in).nextDouble();
            System.out.printf("%.1f%n", (num1 * 2 + num2 * 3 + num3 * 5) / 10);
        }
    }
}
