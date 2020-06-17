package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String s = "S";
        int i = 10;
        while (i > 0){
            int j = 10;
            while (j > 0){
                System.out.print(s);
                j--;
            }
            System.out.println();
            i--;
        }

    }
}
