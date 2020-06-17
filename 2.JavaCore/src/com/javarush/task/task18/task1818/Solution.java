package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fosOne = new FileOutputStream(reader.readLine());
        FileInputStream fisTwo = new FileInputStream(reader.readLine());
        FileInputStream fisThree = new FileInputStream(reader.readLine());

        while (fisTwo.available() > 0){
            fosOne.write(fisTwo.read());
        }
        fisTwo.close();

        byte[] bufferThree = new byte[fisThree.available()];
        int count = 0;
        while (fisThree.available() > 0){
            count = fisThree.read(bufferThree);
        }
        fisThree.close();

        fosOne.write(bufferThree,0,count);
        fosOne.close();

    }
}
