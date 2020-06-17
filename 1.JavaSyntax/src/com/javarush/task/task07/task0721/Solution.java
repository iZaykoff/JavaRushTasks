package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        //напишите тут ваш код
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        int maximum = array[0];
        int minimum = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum){
                maximum = array[i];
            }
            if (array[i] < minimum){
                minimum = array[i];
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}
