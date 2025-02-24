package ru.sber.base.syntax;
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int maxValue = 0;
        int maxIndex = 0;
        double midValue = 0;
        for (int i = 0; i < array.length; ++i) {
            array[i] = (int) (Math.random() * 1000);
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i + 1;
            }
            midValue = midValue + array[i];
        }
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Максимальное значение = [" + maxValue + "] находится в элементе под индексом [" + maxIndex + "]");
        System.out.println("Среднее значение = [" + midValue / array.length +"]");
    }
}
