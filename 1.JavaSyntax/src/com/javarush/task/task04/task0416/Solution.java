package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        double time = scanner.nextDouble();
        int tInt = (int) time;

        if (tInt % 5 == 3){
            System.out.println("жёлтый");
        }else if (tInt % 5 == 4){
            System.out.println("красный");
        }else {
            System.out.println("зелёный");
        }

    }
}