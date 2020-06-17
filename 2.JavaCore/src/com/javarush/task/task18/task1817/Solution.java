package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        int countSpace = 0;
        int countSymbol = 0;
        while (fis.available() > 0){
            if (fis.read() == 32)
                countSpace++;
            countSymbol++;
        }
        fis.close();
        double sum = (double) countSpace/countSymbol*100;
        System.out.println(Math.round(sum*100)/100.0);
    }
}
