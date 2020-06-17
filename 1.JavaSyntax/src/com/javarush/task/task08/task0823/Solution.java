package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //напишите тут ваш код
        string = string.toUpperCase();
        String[] arr = string.trim().split(" +");
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i].charAt(0);
            arr[i] = arr[i].substring(1).toLowerCase();
            System.out.print(c + arr[i] + " ");
        }
    }
}
