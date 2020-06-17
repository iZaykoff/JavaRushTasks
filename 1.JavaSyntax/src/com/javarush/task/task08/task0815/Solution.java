package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("A","a");
        map.put("B","b");
        map.put("C","c");
        map.put("D","a");
        map.put("F","b");
        map.put("Q","c");
        map.put("E","a");
        map.put("H","b");
        map.put("X","c");
        map.put("Z","a");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> entryIterator = map.entrySet().iterator();
        int count = 0;
        while (entryIterator.hasNext()){
            Map.Entry<String, String> oneStep = entryIterator.next();
            String oneValue = oneStep.getValue();
            if (oneValue.contains(name)){
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> entryIterator = map.entrySet().iterator();
        int count = 0;
        while (entryIterator.hasNext()){
            Map.Entry<String, String> oneStep = entryIterator.next();
            String oneKey = oneStep.getKey();
            if (oneKey.equals(lastName)){
                count++;
            }
        }
        return count;


    }

    public static void main(String[] args) {

    }
}
