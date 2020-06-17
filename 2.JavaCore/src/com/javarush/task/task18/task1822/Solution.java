package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(new FileReader(reader.readLine()));
        reader.close();
        while (scan.hasNext()){
            String line = scan.nextLine();
            if (line.startsWith(args[0] + " "))
                System.out.println(line);
//            String[] arrStr = line.split(" ");
//            if (args[0].equals(arrStr[0])){
//                for (int i = 0; i < arrStr.length; i++) {
//                    System.out.print(arrStr[i] + " ");
//                }
//                System.out.println();
//            }
        }
        scan.close();
    }
}
