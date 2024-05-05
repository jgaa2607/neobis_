package org.example;

import java.util.Scanner;

public class Grenais {
    public void solution() {
        int totalInterGoals = 0;
        int totalGrenalGoals = 0;
        int count = 0;
        int empates = 0;
        while (true) {
            System.out.print("Write the number of goals scored by Inter: ");
            int interGoal = new Scanner(System.in).nextInt();
            System.out.print("Write the number of goals scored by Grenal: ");
            int grenalGoal = new Scanner(System.in).nextInt();
            System.out.print("Novo grenal (1-sim 2-nao) ");
            int grenal = new Scanner(System.in).nextInt();
            if (interGoal > grenalGoal) {
                totalInterGoals++;
            } else if (interGoal < grenalGoal) {
                totalGrenalGoals++;
            } else {
                empates++;
            }
            count++;

            if (grenal == 2) {
                System.out.println(count + " grenais");
                System.out.println("Inter: " + totalInterGoals);
                System.out.println("Gremio: " + totalGrenalGoals);
                System.out.println("Empates: " + empates);
                if (totalInterGoals > totalGrenalGoals) {
                    System.out.println("Inter venceu mais!");
                } else if (totalInterGoals < totalGrenalGoals) {
                    System.out.println("Grenal venceu mais!");
                } else {
                    System.out.println("Não houve vencedor!");
                }
                break;
            }
        }
    }
}
