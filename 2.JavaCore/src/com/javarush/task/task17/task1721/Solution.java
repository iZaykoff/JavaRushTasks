package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String fileOne = reader.readLine();
            String fileTwo = reader.readLine();
            reader = new BufferedReader(new FileReader(fileOne));
            String line;
            while ((line = reader.readLine()) != null){
                allLines.add(line);
            }
            reader = new BufferedReader(new FileReader(fileTwo));
            while ((line = reader.readLine()) != null){
                forRemoveLines.add(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            new Solution().joinData();
        } catch (CorruptedDataException e) {
            System.out.println("errors not data");
        }

    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}