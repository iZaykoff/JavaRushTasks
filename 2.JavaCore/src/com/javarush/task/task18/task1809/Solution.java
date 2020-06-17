package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        FileOutputStream fos = new FileOutputStream(reader.readLine());
        reader.close();

        byte[] buffer = new byte[fis.available()];
        int len = 0;
        while (fis.available() > 0){
            len = fis.read(buffer);
        }
        fis.close();

        for (int i = len; i > 0; i--) {
            fos.write(buffer[i-1]);
        }
        fos.close();
    }
}
