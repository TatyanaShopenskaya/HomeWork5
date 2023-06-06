package org.example;

import java.util.HashMap;

public class HW5 {
    public static void main(String[] args) {

//      Создать множество, ключ и значение строки. Добавить шесть элементов.
//      Вывести в консоль значения.

        HashMap<Integer, String> flowers = new HashMap<>();
        flowers.put(1, "Тюльпан");
        flowers.put(2, "Подсолнух");
        flowers.put(5, "Роза");
        flowers.put(8, "Ромашка");
        flowers.put(15, "Одуванчик");
        flowers.put(30, "Незабудка");
        System.out.println("-Первое множество-");
        flowers.forEach((k, v) -> System.out.println(k + " " + v));   //печать в столбик
        //flowers.forEach((k, v) -> System.out.println(k + " " + v+"!"));  //печать + "!"
        System.out.println();


//         Добавить ко всем значениям символ "!"

        flowers.computeIfPresent(1, (k, v) -> v + '!');
        flowers.computeIfPresent(2, (k, v) -> v + '!');
        flowers.computeIfPresent(5, (k, v) -> v + '!');
        flowers.computeIfPresent(8, (k, v) -> v + '!');
        flowers.computeIfPresent(15, (k, v) -> v + '!');
        flowers.computeIfPresent(30, (k, v) -> v + '!');
        System.out.println(flowers);
        System.out.println();


//      Создать второе множество с таким же обобщением. Ключи второго множества частично совпадают с ключами первого.
        HashMap<Integer, String> flowers2 = new HashMap<>();
        flowers2.put(1, "Нарцисс");
        flowers2.put(2, "Колокольчик");
        flowers2.put(5, "Бархатец");
        flowers2.put(22, "Дельфиниум");
        flowers2.put(9, "Астра");
        flowers2.put(10, "Пион");
        System.out.println("-Второе множество-");
        flowers2.forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println();


//      Объединить значения во втором множестве и первом, если ключи совпадают. Вывести результат в консоль.
//      Реализовать с использованием метода merge.

        for (Integer item : flowers.keySet()) {
            flowers.merge(item, flowers2.getOrDefault(item, ""), (k, v) -> k + v);
        }
        System.out.println("-merge-");
        flowers.forEach((k, v) -> System.out.println(k + " "+v));
    }
}








