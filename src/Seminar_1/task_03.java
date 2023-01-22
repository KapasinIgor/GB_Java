package Seminar_1;

// Task3
// Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
// Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.

import java.util.Arrays;

public class task_03 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            int counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {counter++;}
            }
            if (counter == 2) {System.out.println(i);}
        }
    }

}
