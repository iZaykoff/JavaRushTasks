package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();

        InputStream fileInStream = new FileInputStream(nameFile);
        reader = new BufferedReader(new InputStreamReader(fileInStream));


        while (reader.ready()){
            System.out.println(reader.readLine());
        }

        fileInStream.close();
        reader.close();
    }
}