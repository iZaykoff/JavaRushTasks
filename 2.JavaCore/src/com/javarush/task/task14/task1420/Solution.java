package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        findExceptionNaturalNum(x,y);
        System.out.println(findNOD(x,y));

    }

    public static void findExceptionNaturalNum (int x, int y){
        if (x <= 0 || y <= 0){
            throw new ArithmeticException("введено не натуральное число");
        }
    }

    public static int findNOD (int x, int y){

        if ((x-y) == 0){
            return x;
        } else if (x > y){
            x = x - y;
            return findNOD(x, y);
        } else {
            y = y - x;
            return findNOD(x, y);
        }
    }
}
