package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] bigArray = new int[20];
        int[] smalArrayOne = new int[10];
        int[] smalArrayTwo = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = Integer.parseInt(reader.readLine());
            if (i<10){
                smalArrayOne[i] = bigArray[bigArray.length-i-10];
            }else
                smalArrayTwo[i-10] = bigArray[i];
        }

        for (int i = 0; i < smalArrayTwo.length; i++) {
            System.out.println(smalArrayTwo[i]);
        }
    }
}
