package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if (i%2==0 && i>0 && i<10){
            System.out.println("четное однозначное число");
        }else if (i%2!=0 && i>0 && i<10){
            System.out.println("нечетное однозначное число");
        }else if (i%2==0 && i>9 && i<100){
            System.out.println("четное двузначное число");
        }else if (i%2!=0 && i>9 && i<100){
            System.out.println("нечетное двузначное число");
        }else if (i%2==0 && i>99 && i<1000){
            System.out.println("четное трехзначное число");
        }else if (i%2!=0 && i>99 && i<1000){
            System.out.println("нечетное трехзначное число");
        }

    }
}
