package com.hillel.homework_5.fibonacci;

import java.util.Scanner;

public class FibonacciRowClass {
    public static void calculateFibonacci() {
        int num0 = 0;
        int num1 = 1;
        int num2;
        int i;
        int n;
        int surprise;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please, enter the value of Fibonacci row: ");
            while (!sc.hasNextInt()) {
                System.out.println("Unknown symbol/type, please retry!");
                sc.next();
            }
            n = sc.nextInt();
        } while (n <= 0);
        System.out.print(num0 + " " + num1 + " ");
        for (i = 0; i < n; i++) {
            num2 = num0 + num1;
            System.out.print(num2 + " ");
            num0 = num1;
            num1 = num2;
        }
        System.out.println();

        do {
            System.out.println("To see smth interesting press 1.");
            while (!sc.hasNextInt()) {
                System.out.println("Unknown symbol/type, please retry!");
                sc.next();
            }
            surprise = sc.nextInt();
        } while (surprise <= 0);
        if (surprise == 1) {
            System.out.println("""
                    Числа Фибоначчи — элементы числовой последовательности
                    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,
                    987, 1597, 2584, 4181, 6765, 10946, 17711, … (последовательность A000045 в OEIS),
                    в которой первые два числа равны либо 1 и 1, либо 0 и 1, а каждое последующее число
                    равно сумме двух предыдущих чисел.
                    Названы в честь средневекового математика Леонардо Пизанского (известного как Фибоначчи)""");
        } else System.out.println("Oh... It is okay, bye!");
    }
}
