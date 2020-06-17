package com.javarush.task.task15.task1529;

/* 
Осваивание статического блока
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String word = reader.readLine();
            if (word.contains("helicopter")){
                result = new Helicopter();
            } else if (word.contains("plane")){
                int people = Integer.parseInt(reader.readLine());
                result = new Plane(people);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
