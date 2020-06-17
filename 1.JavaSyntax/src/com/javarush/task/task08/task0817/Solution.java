package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("A","y");
        map.put("B","b");
        map.put("C","x");
        map.put("D","a");
        map.put("F","b");
        map.put("Q","c");
        map.put("E","a");
        map.put("H","b");
        map.put("X","c");
        map.put("Z","a");
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        String[] names = new String[map.size()];
        int iName = 0;
        while (iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();

            int count = 0;
            Iterator<Map.Entry<String, String>> iteratorSecond = map.entrySet().iterator();
            while (iteratorSecond.hasNext()){
                Map.Entry<String, String> pairSecond = iteratorSecond.next();
                String valueSecond = pairSecond.getValue();
                if (valueSecond.equals(value)){
                    count++;
                }
            }
            if (count > 1){
                    names[iName] = value;
                    iName++;
            }
        }

        for (int i = 0; i < names.length; i++) {
            removeItemFromMapByValue(map,names[i]);
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());

    }
}