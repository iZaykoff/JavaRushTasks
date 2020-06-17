package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        int count = 0;
        int[] arr = new int[10];
        int x = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i-1))){
                count ++;
            }
            if (!list.get(i - 1).equals(list.get(i)) || i == list.size()-1){
                arr[x] = count +1;
                x++;
                count = 0;
            }
        }

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}