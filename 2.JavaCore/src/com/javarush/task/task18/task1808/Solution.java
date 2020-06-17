package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        FileOutputStream fos1 = new FileOutputStream(reader.readLine());
        FileOutputStream fos2 = new FileOutputStream(reader.readLine());
        reader.close();

        byte[] buffer = new byte[fis.available()];
        int count = 0;
        while (fis.available() > 0){
            count = fis.read(buffer);
        }

        if (count % 2 == 0){
            fos1.write(buffer, 0, count/2);
            fos2.write(buffer, count/2, count/2);
        } else {
            fos1.write(buffer, 0, count/2+1);
            fos2.write(buffer, count/2+1, count/2);
        }

        fis.close();
        fos1.close();
        fos2.close();

    }
}
