package org.example;

import java.util.Scanner;

public class Banknotes {
    int[] arrays = {100, 50, 20, 10, 5, 2, 1};
    int integerNum;

    public void solution() {
        System.out.print("Введите сумму: ");
        int number = new Scanner(System.in).nextInt();
        for (int array : arrays) {
            integerNum = number / array;
            System.out.println(integerNum + " nota(s) de R$ " + String.format("%.2f", (double) array));
            number = number - integerNum * array;
        }
    }
}
