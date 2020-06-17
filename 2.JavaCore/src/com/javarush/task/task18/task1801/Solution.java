package com.javarush.task.task18.task1801;

/* 
Максимальный байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileIn = new FileInputStream(reader.readLine());
        int maxB = 0;
        while (fileIn.available() > 0){
            int data = fileIn.read();
            if (data > maxB){
                maxB = data;
            }
        }
        fileIn.close();
        System.out.println(maxB);
    }
}
