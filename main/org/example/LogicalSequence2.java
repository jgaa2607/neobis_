package org.example;

import java.util.Scanner;

public class LogicalSequence2 {
    public void solution() {
        System.out.print("Введите количество столбцов X (1 < X < 20): ");
        int col = new Scanner(System.in).nextInt();
        System.out.print("Введите конечное число Y (X < Y < 100000): ");
        int maxNumber = new Scanner(System.in).nextInt();
        int number = 1;
        while (number <= maxNumber) {
            for (int i = 0; i < col; i++) {
                if (number <= maxNumber) {
                    System.out.print(number + " ");
                }
                number++;
            }
            System.out.println();
        }
    }
}
