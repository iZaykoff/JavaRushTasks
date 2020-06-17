package com.javarush.task.task04.task0432;

/* 
Хорошего много не бывает
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int number = sc.nextInt();
        while (number > 0){
            System.out.println(word);
            number--;
        }

    }
}
