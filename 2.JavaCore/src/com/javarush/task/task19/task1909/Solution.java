package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader filereader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter filewrite = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();
        while (filereader.ready()){
            String data = filereader.readLine().replaceAll("\\.","!");
            filewrite.write(data);
        }
        filereader.close();
        filewrite.close();
    }
}
