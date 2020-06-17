package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        while (!fileName.equals("exit")){
            new ReadThread(fileName).start();
            fileName = reader.readLine();
        }
        System.out.println(resultMap.toString());
    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try (FileInputStream fis = new FileInputStream(fileName)) {
                int[] buffer = new int[256];
                while (fis.available() > 0) {
                    buffer[fis.read()]++;
                }
                int element = 1;
                int count = 0;
                for (int i = 1; i < buffer.length; i++) {
                    if (buffer[i] > count) {
                        element = i;
                        count = buffer[i];
                    }
                }
                resultMap.put(fileName, element);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
