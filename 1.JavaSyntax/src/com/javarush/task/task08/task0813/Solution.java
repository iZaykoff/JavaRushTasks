package com.javarush.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        Set<String> set = new HashSet<>();
        String[] words = new String[]{"Лето0","Лето1","Лето2","Лето3",
        "Лето4","Лето5","Лето6","Лето7","Лето8","Лето9","Лето10","Лето11","Лето12",
        "Лето13","Лето14","Лето15","Лето16","Лето17","Лето18","Лето19"};
        for (int i = 0; i < 20; i++) {
            set.add(words[i]);
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
