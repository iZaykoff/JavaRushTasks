package com.javarush.task.task18.task1805;

/* 
Сортировка байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        int[] array = new int[256];
        while (fis.available() > 0){
            array[fis.read()]++;
        }
        fis.close();
        int[] arraySort = new int[256];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 1){
                arraySort[count] = i;
                count++;
            }
        }
        Arrays.sort(arraySort);
        for (int i = 0; i < arraySort.length; i++) {
            if (arraySort[i] > 1)
                System.out.print(arraySort[i] + " ");
        }
    }
}
