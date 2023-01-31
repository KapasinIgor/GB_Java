package Seminar_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

//Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
// и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.
public class task_02 {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(5,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,8,7));
        Deque<Integer> res = sum(d1, d2);
        System.out.println(res);
    }


    public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> d3 = new ArrayDeque<>();
        int plus = 0;
        while (!d1.isEmpty() || !d2.isEmpty()) {
            int num = d1.pollFirst() + d2.pollFirst();
            if (num > 9) {
                d3.addLast(num % 10 + plus);
                if (d1.size() > 0 || d2.size() > 0) plus = 1;
                else d3.addLast(1);
            }
            else {
                if (plus > 0) {
                    d3.addLast(num + plus);
                    plus = 0;
                } else d3.addLast(num);
            }
        }
        return new ArrayDeque<>(d3);
    }
}
