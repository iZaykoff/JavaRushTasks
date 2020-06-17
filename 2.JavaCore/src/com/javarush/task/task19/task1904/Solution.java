package com.javarush.task.task19.task1904;

/* 
И еще один адаптер
*/

import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException{
            String[] line = fileScanner.nextLine().split(" ");
            SimpleDateFormat sp = new SimpleDateFormat("dd MM yyyy");
            Date date = null;
            try {
                date = sp.parse(String.format("%s %s %s",line[3],line[4],line[5]));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return new Person(line[1],line[2],line[0],date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
