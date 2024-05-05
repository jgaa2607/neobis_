package org.example;

import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class PopulationIncrease {
    public void solution() {
        System.out.println("Write number of test cases (1 <= T <= 3000): ");
        int numCase = new Scanner(System.in).nextInt();
        String string;
        String[] array;
        int PA;
        int PB;
        double paInc;
        double pbInc;
        int years = 0;
        for (int i = 0; i < numCase; i++) {
            System.out.println("Write PA and PB (100 <= PA <= 1000000, 100 <= PB <= 1000000) \n" +
                    "and two numbers G1 and G2 (0.1 ≤ G1 ≤ 10.0, 0.0 ≤ G2 ≤ 10.0, G2 < G1): ");
            string = new Scanner(System.in).nextLine();
            array = string.split(" ");
            PA = parseInt(array[0]);
            PB = parseInt(array[1]);
            paInc = parseDouble(array[2]);
            pbInc = parseDouble(array[3]);
            while (true) {
                PA = (int) (PA + (PA * paInc) / 100);
                PB = (int) (PB + (PB * pbInc) / 100);
                years++;
                if (PA > PB) {
                    if (years > 100) {
                        System.out.println("Mais de 1 seculo");
                    } else {
                        System.out.println(years + " anos.");
                    }
                    break;
                }
            }
        }
    }
}
