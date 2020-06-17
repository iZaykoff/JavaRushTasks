package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(args[1]));
        StringBuffer sb = new StringBuffer();
        while (fileReader.ready()){
            String[] line = fileReader.readLine().split(" ");
            for (String s : line) {
                if (s.length() > 6)
                    sb.append(s).append(",");
            }
        }
        sb.deleteCharAt(sb.length()-1);
        fileWriter.write(sb.toString());
        fileReader.close();
        fileWriter.close();
    }
}
