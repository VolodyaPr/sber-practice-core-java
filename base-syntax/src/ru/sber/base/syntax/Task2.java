package ru.sber.base.syntax;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int num = scanner.nextInt();
        if (num < 1 || num > 500)
        {
            System.out.println("Введено недопустимое число " + num + ". Допустимый диапазон значений: 1 - 500.");
        }
        else
        {
            for (int i = 1; i <= num; i++) {
                System.out.print((i * 7) + " ");
            }
            System.out.println();
        }
    }
}
