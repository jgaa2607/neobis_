package org.example;

import java.util.Scanner;

public class BanknotesAndCoins {
    int[] banknotes = {100, 50, 20, 10, 5, 2};
    int[] coins = {100, 50, 25, 10, 5, 1};
    int integerNum;

    public void solution() {
        System.out.print("Введите сумму: ");
        double number = new Scanner(System.in).nextDouble();

        int intPart = (int) number;
        int fraction = (int) Math.round((number - intPart) * 100);
        System.out.println("NOTAS:");
        for (int banknote : banknotes) {
            integerNum = intPart / banknote;
            System.out.println(integerNum + " nota(s) de R$ " + String.format("%.2f", (double) banknote));
            intPart = intPart - integerNum * banknote;
        }
        System.out.println("MOEDAS:");
        fraction = fraction + intPart * 100;
        for (int coin : coins) {
            integerNum = fraction / coin;
            System.out.println(integerNum + " moeda(s) de R$ " + String.format("%.2f", (double) coin / 100));
            fraction = fraction - integerNum * coin;
        }
    }
}
