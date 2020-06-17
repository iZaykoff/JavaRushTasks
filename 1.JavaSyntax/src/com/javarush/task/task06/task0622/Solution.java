package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        int n = numbers.length;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n-i-1 ; j++) {
                if (numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }

            }
        }

        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
        }

        //напишите тут ваш код
    }
}
