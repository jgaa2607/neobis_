package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TriangleTypes {
    public void solution() {
        System.out.print("Введите 1-сторону треугольника ");
        int side1 = new Scanner(System.in).nextInt();
        System.out.print("Введите 2-сторону треугольника ");
        int side2 = new Scanner(System.in).nextInt();
        System.out.print("Введите 3-сторону треугольника ");
        int side3 = new Scanner(System.in).nextInt();
        Integer[] triangleArray = {side1, side2, side3};
        Arrays.sort(triangleArray, Collections.reverseOrder());
        int a = triangleArray[0];
        int b = triangleArray[1];
        int c = triangleArray[2];
        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (Math.pow(a, 2) == (Math.pow(b, 2)) + Math.pow(c, 2)) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (Math.pow(a, 2) > (Math.pow(b, 2)) + Math.pow(c, 2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (Math.pow(a, 2) < (Math.pow(b, 2)) + Math.pow(c, 2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a == b && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((a == b && b != c) || (a == c && b != c) || (c == b && b != a)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
