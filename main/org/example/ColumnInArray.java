package org.example;

import java.util.Scanner;

public class ColumnInArray {
    public void solution() {
        double[][] array = new double[12][12];
        System.out.println("Задан следующий двумерный массив:");
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                array[i][j] = Math.random() * 100;
                System.out.printf("%5.1f", array[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.print("Введите номер столбца: ");
        int col = new Scanner(System.in).nextInt();
        System.out.print("Введите S для вычясления суммы и M для нахождения среднего: ");
        String action = new Scanner(System.in).nextLine();
        action = action.toLowerCase();
        double sum = 0;
        double medium;

        switch (action) {
            case "s":
                for (int i = 0; i < 12; i++) {
                    sum += array[i][col - 1];
                }
                System.out.println("Сумма " + col + " - столбца " + String.format("%.1f", sum));
                break;
            case "m":
                for (int i = 0; i < 12; i++) {
                    sum += array[i][col - 1];
                }
                medium = sum / 12;
                System.out.println("Среднее значение " + col + " - столбца " + String.format("%.1f", medium));
                break;
        }
    }
}
