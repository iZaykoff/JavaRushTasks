package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        int cout = 0;

        while (fis.available() > 0) {
            String countLetter = String.valueOf((char) fis.read());
            if (countLetter.matches("[a-zA-Z]")){
                cout++;
            }
        }
        fis.close();
        System.out.println(cout);
    }
}
