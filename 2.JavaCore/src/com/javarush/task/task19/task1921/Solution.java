package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        List<String> list = new ArrayList<>();
        while (reader.ready()){
            list.add(reader.readLine());
        }
        reader.close();
        Date date;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
        for (String s : list) {
            String name = s.replaceAll("\\d","").trim();
            String bd = s.replaceAll("[^\\d\\s]","").trim();
            date = dateFormat.parse(bd);
            PEOPLE.add(new Person(name,date));
        }

    }
}
