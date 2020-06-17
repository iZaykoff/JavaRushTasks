package com.javarush.task.task18.task1804;

/* 
Самые редкие байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        int[] array = new int[256];
        while (fis.available() > 0){
            array[fis.read()]++;
        }
        fis.close();
        int min = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min)
                System.out.print(i + " ");
        }
    }
}
