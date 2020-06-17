package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);

        int[] bufferNumber = new int[256];
        while (fis.available() > 0){
            int i = fis.read();
            bufferNumber[i]++;
        }

        for (int i = 0; i < bufferNumber.length; i++) {
            if (bufferNumber[i] != 0)
                System.out.println((char)i + " " + bufferNumber[i]);
        }
        fis.close();
    }
}
