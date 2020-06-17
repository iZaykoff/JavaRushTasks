package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0){
            System.out.println(number * 2);
        }
        if (number < 0){
            System.out.println(number + 1);
        }
        if (number == 0)
            System.out.println(0);

    }

}