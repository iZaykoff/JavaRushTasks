package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();

        BufferedWriter bufWriter = new BufferedWriter(new FileWriter(nameFile));

        while (reader.ready()){
            String writeLine = reader.readLine();
            bufWriter.write(writeLine + "\n");

            if (writeLine.equals("exit")){
                break;
            }
        }

        bufWriter.close();
        reader.close();
    }
}
