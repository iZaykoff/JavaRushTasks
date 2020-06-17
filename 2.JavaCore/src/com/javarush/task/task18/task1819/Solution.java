package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileOne = reader.readLine();
        String fileTwo = reader.readLine();
        FileInputStream fisOne = new FileInputStream(fileOne);
        FileInputStream fisTwo = new FileInputStream(fileTwo);

        byte[] bufferOne = new byte[fisOne.available()];
        int size = 0;
        while (fisOne.available() > 0){
            size = fisOne.read(bufferOne);
        }
        fisOne.close();

        FileOutputStream fosOne = new FileOutputStream(fileOne);
        while (fisTwo.available() > 0){
            fosOne.write(fisTwo.read());
        }
        fisTwo.close();

        fosOne.write(bufferOne,0,size);
        fosOne.close();
    }
}
