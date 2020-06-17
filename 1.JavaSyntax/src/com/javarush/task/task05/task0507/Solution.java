package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        double count = 0;
        int countNum = 0;
        while (true){
            int i = sc.nextInt();
            if (i == -1){
                break;
            }
            count += i;
            countNum++;
        }
        System.out.println(count/countNum);
    }
}

