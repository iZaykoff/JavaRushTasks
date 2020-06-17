package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String,String> map = new HashMap<>();
        while (true) {
            String cityKey = reader.readLine();
            if (cityKey.isEmpty()){
                break;
            }
            String familyValue = reader.readLine();
            if (familyValue.isEmpty()){
                break;
            }
            map.put(cityKey,familyValue);
        }

        String city = reader.readLine();

        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> pair = iterator.next();
            if (pair.getKey().equals(city)){
                System.out.println(pair.getValue());
                break;
            }
        }

    }
}
