package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int fourth = scanner.nextInt();
        int one;
        int two;

        if (first > second){
            one = first;
        }else {
            one = second;
        }

        if (third > fourth){
            two = third;
        }else {
            two = fourth;
        }

        if (one > two){
            System.out.println(one);
        }else {
            System.out.println(two);
        }

    }
}
