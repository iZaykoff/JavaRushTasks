package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("мера");
        strings.add("лира");
        strings.add("лоза");
        strings.add("вода");
        strings.add("упор");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        for (int i = 0; i < strings.size(); i++) {

             if (strings.get(i).indexOf('р') > -1 && strings.get(i).indexOf('л') < 0){
                strings.remove(strings.get(i));
                 i -= 1;
            } else if (strings.get(i).indexOf('л') > -1 && strings.get(i).indexOf('р') < 0){
                 strings.add(i,strings.get(i));
                 i += 1;


             }
        }
        return strings;
    }
}