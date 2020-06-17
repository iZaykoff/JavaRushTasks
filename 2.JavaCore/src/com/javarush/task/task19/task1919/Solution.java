package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        List<String> list = new ArrayList<>();// не нужон! только дерево!
        while (reader.ready()){
            list.add(reader.readLine());
        }
        reader.close();

        Map<String,Double> treeMap = new TreeMap<>();
        for (String s : list) {
            String[] element = s.split(" ");
            if (treeMap.containsKey(element[0])){
                double el = Double.parseDouble(element[1]) + treeMap.get(element[0]);
                treeMap.put(element[0],el);
            } else
                treeMap.put(element[0],Double.parseDouble(element[1]));

        }
        for (Map.Entry<String,Double> entry : treeMap.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    }
}
