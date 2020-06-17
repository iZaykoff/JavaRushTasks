package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        int count = 0;
        while (fileReader.ready()){
            String[] line = fileReader.readLine().split("\\W+");
            for (String s : line) {
                if (s.equals("world"))
                    count++;
            }
        }
        System.out.println(count);
        fileReader.close();
    }
}
