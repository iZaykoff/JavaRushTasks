package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        TreeSet<String> set = new TreeSet<>();
        while (!(fileName = reader.readLine()).equals("end")){
            set.add(fileName);
        }
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(set.first().replaceAll("(.part\\d+)", "")))) {
            for (String s : set) {
                try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(s))){
                    byte[] buffer = new byte[bis.available()];
                    bis.read(buffer);
                    bos.write(buffer);
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }


//        Map<Integer, String> map = new HashMap<>();
//
//        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileName.replaceAll("(.part\\d+)", "")))) {
//            while (!fileName.equals("end")) {
//                try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName))) {
//                    byte[] buffer = new byte[bis.available()];
//                    bis.read(buffer);
//                    String text = new String(buffer);
//                    int partN = Integer.parseInt(fileName.replaceAll("[^\\d*$]", ""));
//                    map.put(partN, text);
//                    fileName = reader.readLine();
//                }
//            }
//            for (int i = 1; i <= map.size(); i++) {
//                bos.write(map.get(i).getBytes());
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

    }
}
