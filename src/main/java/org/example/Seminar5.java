package org.example;

//у HashMap нет индексов, только ключи!!!
import java.lang.reflect.Array;
import java.util.*;

    public class Seminar5 {
        public static void main(String[] args) {

            HashMap<Integer, String> hashMap = new HashMap<>();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 16; i++) {
                list.add(new Random().nextInt());
            }
            list.forEach(n -> System.out.println(Math.abs(n % 16)));    //Math.abs - убираем "-", n%16 - преобразует огромные номера индексов в маленькие

            int[] ints = new int[16];    //здесь храним ключи и значения


            // в LinkedList можно удалять данные из середины, а в ArrayList нельзя
            //коллекция HashMap нужен, чтобы было легко идентифицировать(действия персонажей комп.игр)


        hashMap.put(1, "One");
        hashMap.put(11, "Flower");
//        hashMap.put(1, null);     //final значит, что ключ нельзя изменить
//        hashMap.putIfAbsent(1, "?");    //добавит эту пару, только, если ключ 1 НЕ существует
//        System.out.println(hashMap.get(1));
//        hashMap.get(1);           //получить значение по ключу
//        hashMap.getOrDefault(2, "Def");    //если ключ 2 найден, то он вернет значение по ключу, если не найден - вернет значение по умолчанию 'DEF'
//        hashMap.replace(1,"2");            //заменяет у ключа значение, но не создаст новый ключ
//        hashMap.replace(1,"1",  "2");      //заменяет конкретную указанную пару на новое значение 2
//        if (hashMap.containsValue("1"));   // есть ли в нашем мапе значение 1(тру/фолс)
//        if (hashMap.containsKey(1));        //есть ли в нашем мапе ключ 1(тру/фолс)

//        hashMap.compute(1, (k, v) -> v += k);    //от 8 JAVA. //для ключа 1 указываем как мы хотим поменять значения,К-ключ
//        hashMap.computeIfPresent(1, (k, v) -> v = "!"+k);   //то же самое, но работает только, если ключ найден
//        hashMap.computeIfAbsent(2, v -> "Three");    //то же самое, но работает только если такого ключа НЕТ
//        System.out.println(hashMap.get(2));




//        //Перебор элементов в HashMap
//
//            for (int i = 0; i < 10; i++) {

//                hashMap.put(new Random().nextInt(), Character.getName(i));    //ключи-будут рандомные, Character-класс обертка вокруг чаров, getName- возвращает строчное значение буквы с индексом в параметре()
//            }

//            for (int i = 0; i < hashMap.size(); i++) {
//                int index = (int) hashMap.keySet().toArray()[i];   //возвращает множество ключей
//                System.out.println(hashMap.get(index));     //чтобы получить индексы


                hashMap.forEach((k, v) -> System.out.println(k + " " + v));    //перебирает пары ключ-значение
            }
        }



//        for (String s: hashMap.values()) {       //forEach //values - перебирает все значения, но нет ключей и нельзя менять
//            System.out.println(s);
//        }






//        Iterator<String> iterator = hashMap.values().iterator();    //перебор итератором
//        while (iterator.hasNext()){
//            String s = iterator.next();
//            iterator.remove();                          //можно удалить ключ-значение
//            System.out.println(s);
//        }








//TreeMap - элементы хранятся не в массиве, каждый эл-т знает только 2 своих дочерних эл-та(левый и правый)
//здесь ключи отсортированы и надо найти корень(среднее значение), и у эл-тов по бокам от корня -тоже найти корни

//            TreeMap<Integer, String> treeMap = new TreeMap<>(Comparator.reverseOrder());  //сортировка в обратном порядке
//
//            treeMap.put(16, "Many");
//            treeMap.put(1, "One");
//            treeMap.put(5, "Five");
//            treeMap.put(0, "Many");
//            treeMap.put(7, "One");
//            treeMap.put(15, "Five");
//


//            treeMap.headMap(12, true);   //возвращает мапы от 1 до 12 включая (тру)
//            treeMap.tailMap(12, true);   //возвращает мапу от 12 до конца включая последний эл-т(тру)
//            treeMap.subMap(2, 12);       //возвращает мапы от 2 до 12
//
//
//
//
//            System.out.println(treeMap.keySet());    //выводим отсортированный значения ключей тримэп
//
//
//        }

//    }
//}
