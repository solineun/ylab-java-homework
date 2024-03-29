package com.ylab.homework.hw1;

import java.util.Scanner;

public class Pell {
    public static long getPellNumber(int n) throws IllegalArgumentException{
        long[] pellPair = new long[] {0l, 1l};

        if (n > 30 || n < 0) {
            return -1;
        } else if (n < 2) {
            return pellPair[n];
        }

        for (int i = 2; i <= n; i++) {
            long temp = pellPair[1];
            pellPair[1] = 2 * pellPair[1] + pellPair[0];
            pellPair[0] = temp;
        }

        return pellPair[1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("введите позицию числа в последовательности Пелля: ");
        int position = scanner.nextInt();

        long pellNumber = Pell.getPellNumber(position);

        if (pellNumber >= 0) {
            System.out.println(position + "-e число Пелля: " + pellNumber);
        } else {
            System.out.println(
                    "ОШИБКА: введенное число выходит за пределы необходимого диапазона");
        }

        scanner.close();
    }
}
