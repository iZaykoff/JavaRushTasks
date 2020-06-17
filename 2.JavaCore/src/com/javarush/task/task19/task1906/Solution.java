package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fr = new FileReader(reader.readLine());
        FileWriter fw = new FileWriter(reader.readLine());
        reader.close();
        int count = 1;
        while (fr.ready()){
            int data = fr.read();
            if ((count % 2) == 0){
                fw.write(data);
            }
            count++;
        }
        fr.close();
        fw.close();
    }
}
