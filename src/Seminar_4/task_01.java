package Seminar_4;

// Дан Deque состоящий из последовательности цифр.
// Необходимо проверить, что последовательность цифр является палиндромом

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class task_01 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(checkOn(deque));
    }


    public static boolean checkOn(Deque<Integer> deque){
        while (deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast()) {
                break;
            }
        }
        if (deque.size() > 1) {
            return false;
        }
        return true;
    }
}
