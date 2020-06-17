package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (isNumber(array[i]) && isNumber(array[j]))
                    if (Integer.parseInt(array[i]) > Integer.parseInt(array[j])){
                        int num = Integer.parseInt(array[i]);
                        array[i] = array[j];
                        array[j] = String.valueOf(num);
                    }
                if (!isNumber(array[i]) && !isNumber(array[j]))
                    if (isGreaterThan(array[j],array[i])){
                        String temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
            }
        }

//        List<Integer> listNumber = new ArrayList<>();
//        List<String> listWord = new ArrayList<>();
//        int countnum = 0;
//        int countword = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            if (isNumber(array[i]))
//                listNumber.add(Integer.valueOf(array[i]));
//            else
//                listWord.add(array[i]);
//        }
//        Collections.sort(listNumber, Collections.reverseOrder());
//        Collections.sort(listWord);
//        for (int i = 0; i < array.length; i++) {
//            if (isNumber(array[i])){
//                array[i] = String.valueOf(listNumber.get(countnum));
//                countnum++;
//            } else {
//                array[i] = listWord.get(countword);
//                countword++;
//            }
//        }


    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
