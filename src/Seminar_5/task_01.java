package Seminar_5;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Пусть дан список сотрудников:Иван Иванов (и остальные)
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public class task_01 {

    public static void main(final String[] args) {
        List<String> phoneBookRaw = new ArrayList<>(Arrays.asList(
                "Иван Иванов 88001122333",
                "Иван Курицин 88001662333",
                "Иван Курицин 88001112333",
                "Иван Незлобин 88001122432",
                "Сергей Потапов 88001112453",
                "Сергей Потапов 8800163214",
                "Сергей Курицин 8800142421",
                "Михаил Незлобин 880012343"));
        HashMap<String, List<String>> phoneBook = fillPhoneBook(phoneBookRaw);
        namesCount(phoneBook);

    }

    public static HashMap<String, List<String>> fillPhoneBook(List<String> phoneBookIn) {
        HashMap<String, List<String>> phoneBookTemp = new HashMap<>();
        for (String item: phoneBookIn){
            String key = item.substring(0, item.lastIndexOf(" ")).trim();
            String value = item.substring(item.lastIndexOf(" "), item.length()).trim();
            List<String> temp = phoneBookTemp.getOrDefault(key, new ArrayList<>());
            temp.add(value);
            phoneBookTemp.put(key, temp);
        }
        return phoneBookTemp;
    }

    public static void namesCount(HashMap<String, List<String>> phoneBook){
        HashMap<String, Integer> temp = new HashMap<>();
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        for (String key: phoneBook.keySet()){
            String newKey = key.substring(0, key.indexOf(" ")).trim();
            temp.put(newKey, temp.getOrDefault(newKey, 0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>(temp.values());

        Collections.sort(list, Collections.reverseOrder());

        for (int num : list) {
            for (Entry<String, Integer> entry : temp.entrySet()) {
                if (entry.getValue().equals(num) && num > 1) {
                    sortedMap.put(entry.getKey(), num);
                }
            }
        }

        for (String key: sortedMap.keySet()){
            System.out.println(key + " - " + sortedMap.get(key));
        }
    }

}


