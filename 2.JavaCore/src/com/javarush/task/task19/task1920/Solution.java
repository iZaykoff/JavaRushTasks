package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        Map<String,Double> map = new TreeMap<>();
        double max = 0;
        while (reader.ready()){
            String[] element = reader.readLine().split(" ");
            if (map.containsKey(element[0])){
                map.put(element[0],map.get(element[0]) + Double.parseDouble(element[1]));
            } else {
                map.put(element[0],Double.parseDouble(element[1]));
            }
            if (map.get(element[0]) > max)
                max = map.get(element[0]);
        }
        reader.close();
        for (Map.Entry<String,Double> entry : map.entrySet()){
            if (entry.getValue() == max)
                System.out.println(entry.getKey());
        }
    }
}
