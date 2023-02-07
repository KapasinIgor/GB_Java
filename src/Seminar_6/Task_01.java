package Seminar_6;

// 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// 2) Создать коллекцию ноутбуков.
// 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
//    Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
// 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task_01 {

    public static void main(String[] args) {
        List<Notebook> notebooks = initListNotebooks();
        List<Notebook> filtered;
        Map<String, String> params = new HashMap<>();
        params.put("color", "Black");
        params.put("ram", "4");
        params.put("os", "Windows");
        params.put("diagonal", "14");
        filtered = filter(params, notebooks);
        for (Notebook temp: filtered){
            System.out.println(temp.toString());
        }
    }

    public static List<Notebook> initListNotebooks(){
        List<Notebook> notebooks = new ArrayList<>(List.of());
        notebooks.add(new Notebook("Asus", "Black", "14", "Intel", "Intel", "4", "2000", "Windows"));
        notebooks.add(new Notebook("Acer", "Gray", "21", "AMD", "Nvidia", "4", "250", "Linux"));
        notebooks.add(new Notebook("Asus", "White", "14", "Intel", "Nvidia", "16", "250", "Windows"));
        notebooks.add(new Notebook("Acer", "Blue", "15", "AMD", "Intel", "4", "250", "Windows"));
        notebooks.add(new Notebook("Lenovo", "Black", "14", "Intel", "Nvidia", "4", "500", "Windows"));
        notebooks.add(new Notebook("Samsung", "Black", "17", "AMD", "Nvidia", "8", "500", "Linux"));
        notebooks.add(new Notebook("Asus", "Gray", "19", "Intel", "Intel", "8", "1000", "Linux"));
        notebooks.add(new Notebook("Acer", "Blue", "19", "AMD", "Nvidia", "8", "1000", "Windows"));
        notebooks.add(new Notebook("Asus", "Red", "17", "Intel", "Nvidia", "4", "500", "Windows"));
        notebooks.add(new Notebook("Asus", "White", "24", "AMD", "Intel", "16", "250", "Linux"));
        notebooks.add(new Notebook("Lenovo", "Black", "21", "Intel", "Nvidia", "2", "500", "Linux"));
        notebooks.add(new Notebook("Samsung", "Black", "21", "AMD", "Intel", "8", "750", "Windows"));
        return notebooks;
    }

    public static List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks){
        return notebooks.stream().filter(p -> {
            for (String key: params.keySet()){
                if (!p.getParam(key).equals(params.get(key))) return false;
            }
            return true;
        }).collect(Collectors.toList());
    }

}