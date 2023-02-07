package Seminar_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Task_01 {
    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            nums.add((int)(Math.random() * 10));
        }

        System.out.println("Начальный список: ");
        System.out.println(nums);
        System.out.println("Список с удаленными четными числами: ");
        System.out.println(removeEvenValue(nums));
        System.out.println("Минимальное значение");
        System.out.println(getMin(nums));
        System.out.println("Максимальное значение");
        System.out.println(getMax(nums));
        System.out.println("Среднее значение");
        System.out.println(getAverage(nums));
    }

    // Нужно удалить из него четные числа
    public static List<Integer> removeEvenValue(List<Integer> list){
        list.removeIf(item -> item % 2 == 0);
        return list;
    }

    // Найти минимальное значение
    public static Integer getMin(List<Integer> list){
        return Collections.min(list);
    }

    // Найти максимальное значение
    public static Integer getMax(List<Integer> list){
        return Collections.max(list);
    }

    // Найти среднее значение
    public static Double getAverage(List<Integer> list){
        double avg = 0;
        for (int i : list) {
            avg += i;
        }
        return avg / list.size();
    }
}
