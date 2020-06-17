package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(reader.readLine());
        reader = new BufferedReader(new InputStreamReader(inputStream));

        ArrayList<Integer> list = new ArrayList<>();
        while (reader.ready()){
            list.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(list);
        for (Integer integer : list) {
            if (integer % 2 == 0){
                System.out.println(integer);
            }
        }

        reader.close();
        inputStream.close();

    }
}
