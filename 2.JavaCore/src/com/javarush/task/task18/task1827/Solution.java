package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        reader = new BufferedReader(new FileReader(fileName));
        List<String> list = new ArrayList<>();
        int id;
        int max = 0;
        while (reader.ready()){
            String line = reader.readLine();
            list.add(line);
            id = Integer.parseInt(line.substring(0,8).trim());
            if (id > max) max = id;
        }
        reader.close();

        if (args.length == 4 && args[0].equals("-c")){
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            list.add(String.format("%-8d%-30.30s%-8.2f%-4d",
                    max+1,args[1],Double.parseDouble(args[2]),Integer.parseInt(args[3])));
            for (String s : list) {
                writer.write(s);
                writer.newLine();
            }
            writer.close();
        }

    }

}
