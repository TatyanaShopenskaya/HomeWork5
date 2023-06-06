package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class merge {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        ArrayList<String> list = new ArrayList<>(List.of("One", "Two", "One", "Three", "Six"));



        //способ без merge
        //{
            //for (String s : list) {
//                if (!hashMap.containsKey(s))
//                    hashMap.put(s, 1);    //если в хэшмэп нет ключа S, то мы добавляе пару (s, 1)
//                else hashMap.put(s, hashMap.get(s) + 1);
//                hashMap.merge(s, 1, (k, v) -> k + v);  //ключ, новое значение и действие
//
//            }
//            System.out.println(hashMap);


                //более короткий способ c merge

                list.forEach(s -> hashMap.merge(s, 1, (k, v) -> k + v));
                System.out.println(hashMap);
            }
        }











