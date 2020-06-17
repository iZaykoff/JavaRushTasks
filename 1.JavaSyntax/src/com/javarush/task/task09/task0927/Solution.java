package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<>();
        map.put("cat",new Cat("one"));
        map.put("cat1",new Cat("two"));
        map.put("cat2",new Cat("three"));
        map.put("cat3",new Cat("four"));
        map.put("cat4",new Cat("five"));
        map.put("cat5",new Cat("six"));
        map.put("cat6",new Cat("seven"));
        map.put("cat7",new Cat("eight"));
        map.put("cat8",new Cat("nine"));
        map.put("cat9",new Cat("ten"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<>();
        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Cat> pair = iterator.next();
            set.add(pair.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
