package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fis = new FileInputStream(reader.readLine());
        FileOutputStream fos = new FileOutputStream(reader.readLine());
        reader.close();

        StringBuilder sb = new StringBuilder();
        byte[] buffer = new byte[fis.available()];

        while (fis.available() > 0){
            fis.read(buffer);
        }

        for (int i = 0; i < buffer.length; i++) {
            if (buffer[i] != 32){
                sb.append((char) buffer[i]);
            }
            if (buffer[i] == 32 || buffer.length-1 == i){
                String  temp = String.valueOf(sb);
                sb.delete(0,sb.length());
                double tempNum = Math.round(Double.parseDouble(temp));

                if (tempNum < 0 || tempNum > 9){
                    String strNum = String.valueOf((int) tempNum);
                    char[] charNum = strNum.toCharArray();

                    for (int j = 0; j < charNum.length; j++) {
                        fos.write(charNum[j]);
                    }
                } else {
                    fos.write((char) tempNum+'0');
                }

                fos.write(32);
            }
        }

        fis.close();
        fos.close();

    }
}
