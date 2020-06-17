package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] line = new String[10];
        int[] number = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < line.length ; i++) {
            line[i] = reader.readLine();
            number[i] = line[i].length();
        }

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}
