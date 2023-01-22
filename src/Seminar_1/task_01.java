package Seminar_1;

// Task1
// Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
// Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 300].

public class task_01 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) { array[i] = ((int) (Math.random() * 300)); }

        int maxNum = array[0];
        int minNum = array[0];
        for (int j : array) {
            if (j > maxNum) { maxNum = j; }
            if (j < minNum) { minNum = j; }
        }

        int sum = 0;
        for (int j : array) { sum += j; }
        int midNum = sum / array.length;

        System.out.println("Максимальное число: " + maxNum);
        System.out.println("Минимальное число: " + minNum);
        System.out.println("Среднее число: " + midNum);
    }
}
