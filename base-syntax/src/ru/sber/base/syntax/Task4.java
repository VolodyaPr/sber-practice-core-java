package ru.sber.base.syntax;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        boolean exit = true;
        int i = 2;
        if (num < 2) {
            System.out.println("Число должно быть больше 1");
        } else {
            while (i * i <= num) {
                if (num % i == 0) {
                    exit = false;
                    break;
                }
                i++;
            }
            if (exit) {
                System.out.println("Число " + num + " является простым");
            } else {
                System.out.println("Число " + num + " не является простым");
            }
        }
    }
}


