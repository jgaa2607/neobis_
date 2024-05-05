package org.example;

import java.util.Scanner;

public class GameTimeWithMinutes {
    public void solution() {
        System.out.print("Введите часы начала игры: ");
        int hourStart = new Scanner(System.in).nextInt();
        System.out.print("Введите минуты: ");
        int minStart = new Scanner(System.in).nextInt();
        System.out.print("Введите часы конца игры: ");
        int hourEnd = new Scanner(System.in).nextInt();
        System.out.print("Введите минуты: ");
        int minEnd = new Scanner(System.in).nextInt();
        int minutesStart = hourStart * 60 + minStart;
        int minutesEnd = hourEnd * 60 + minEnd;
        int minutesAll;
        int hours;
        int minutes;
        if (minutesStart > minutesEnd) {
            minutesAll = 24 * 60 - minutesStart + minutesEnd;
            hours = (int) minutesAll / 60;
            minutes = minutesAll % 60;
            System.out.println("O JOGO DUROU " + hours + " HORA(S) E " + minutes + " MINUTO(S) *");
        } else if (minutesStart < minutesEnd) {
            minutesAll = minutesEnd - minutesStart;
            hours = (int) minutesAll / 60;
            minutes = minutesAll % 60;
            System.out.println("O JOGO DUROU " + hours + " HORA(S) E " + minutes + " MINUTO(S)");
        } else {
            System.out.println("O JOGO DUROU " + 24 + " HORA(S) E " + 0 + " MINUTO(S)");
        }
    }
}
