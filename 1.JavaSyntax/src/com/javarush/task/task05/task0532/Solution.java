package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maximum = Integer.MIN_VALUE;
        if (n > 0){
            int[] number = new int[n];
            for (int i = 0; i < n; i++) {
                number[i] = Integer.parseInt(reader.readLine());
            }
            int num;
            for (int i = 0; i < number.length ; i++) {
                num = number[i] > number[number.length-1] ? number[i] : number[number.length-1];
                maximum = num > maximum ? num : maximum;
            }
            System.out.println(maximum);
        }


        //напишите тут ваш код

    }
}
