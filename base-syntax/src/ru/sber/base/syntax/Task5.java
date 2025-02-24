package ru.sber.base.syntax;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        int e = 0;
        int t = 1;
        if (num >= 2 && num <= 100) {
            System.out.print("0 1");
            for (int i = 2; i <= num - 1; ++i) {
                int next = e + t;
                e = t;
                t = next;
                System.out.print(" " + t);
            }
        } else
        {
            System.out.println("Введено недопустимое число " + num + ". Допустимый диапазон значений: 2 - 100.");
        }
    }
}
