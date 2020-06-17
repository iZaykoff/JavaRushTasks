package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> list = new ArrayList<>();
    public static BufferedReader reader;

    public static void main(String[] args) throws Exception {
        reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        reader = new BufferedReader(new FileReader(fileName));
        while (reader.ready()){
            list.add(reader.readLine());
        }
        reader.close();

        if (args.length == 4 && args[0].equals("-c")){
            create(fileName,args);
        } else if (args.length == 5 && args[0].equals("-u")){
            for (int i = 0; i < list.size(); i++) {
                if (args[1].equals(list.get(i).substring(0,8).trim())){
//                    list.get(i).replaceAll(".",(String.format("%-8d%-30.30s%-8.2f%-4d",
//                            Integer.parseInt(args[1]),args[2],Double.parseDouble(args[3]),Integer.parseInt(args[4]))));
                    list.add(i,(String.format("%-8d%-30.30s%-8.2f%-4d",
                            Integer.parseInt(args[1]),args[2],Double.parseDouble(args[3]),Integer.parseInt(args[4]))));
                    list.remove(i+1);
                }
            }
            writer(fileName);
        } else if (args.length == 2 && args[0].equals("-d")){
            for (int i = 0; i < list.size(); i++) {
                if (args[1].equals(list.get(i).substring(0,8).trim())){
                    list.remove(i);
                }
            }
            writer(fileName);
        }

    }

    public static void writer(String fileName){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String s : list) {
                writer.write(s);
                writer.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void create(String fileName, String[] args) {
        int id;
        int max = 0;
        for (String s : list) {
            id = Integer.parseInt(s.substring(0,8).trim());
            if (id > max) max = id;
        }

        list.add(String.format("%-8d%-30.30s%-8.2f%-4d",
                max + 1, args[1], Double.parseDouble(args[2]), Integer.parseInt(args[3])));

        writer(fileName);

    }

}