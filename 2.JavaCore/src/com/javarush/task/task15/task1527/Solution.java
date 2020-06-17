package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Pattern pattern = Pattern.compile("(?<=&)\\w*|(?<=\\?)\\w*");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()){
            System.out.print(matcher.group()+" ");
        }
        System.out.println();

        pattern = Pattern.compile("(?<=obj=)\\-*\\d.\\w*\\d*|(?<=obj=)\\w*");
        matcher = pattern.matcher(line);
        while (matcher.find()){
            try {
                alert(Double.parseDouble(matcher.group()));
            } catch (NumberFormatException e){
                alert(matcher.group());
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }

}
