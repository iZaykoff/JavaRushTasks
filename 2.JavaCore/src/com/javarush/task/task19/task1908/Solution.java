package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader filereader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter filewriter = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();
        while (filereader.ready()){
            String[] line = filereader.readLine().split(" ");
            for (int i = 0; i < line.length; i++) {
                if (line[i].matches("\\d+"))
                    filewriter.write(line[i] + " ");
            }
        }
        filereader.close();
        filewriter.close();
    }
}
