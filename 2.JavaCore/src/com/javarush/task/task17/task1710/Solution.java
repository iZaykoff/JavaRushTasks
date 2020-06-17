package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    public static Date date;
    public static SimpleDateFormat parseDate = new SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String line = null;
//        try {
//            line = reader.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        String[] words = line.split(" ");
        switch (args[0]){
            case "-c":
                createAndAddPeople(allPeople, args);
                break;
            case "-u":
                updatePeople(allPeople, args);
                break;
            case "-d":
                deletePeople(allPeople, args);
                break;
            case "-i":
                int numPeople = Integer.parseInt(args[1]);
                formatPrint(allPeople,numPeople);
                break;
        }
    }

    public static void formatPrint (List<Person> allPeople, int numPeople){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);
        //allPeople.get(numPeople).getSex().equals(Sex.MALE)? "м" : "ж"
        //dateFormat.format(allPeople.get(numPeople).getBirthDate())

        String sex;
        if (allPeople.get(numPeople).getSex() == null){
            sex = null;
        }else if (allPeople.get(numPeople).getSex().equals(Sex.MALE)){
            sex = "м";
        }else {
            sex = "ж";
        }

        String dateStr;
        if (allPeople.get(numPeople).getBirthDate() == null){
            dateStr = null;
        } else {
            dateStr = dateFormat.format(allPeople.get(numPeople).getBirthDate());
        }

        System.out.printf("%s %s %s"
                ,allPeople.get(numPeople).getName()
                ,sex
                ,dateStr);
        System.out.println();
    }

    public static void createAndAddPeople(List<Person> allPeople, String[] words){
        try {
            date = parseDate.parse(words[3]);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (words[2].equals("м")) {
            allPeople.add(Person.createMale(words[1], date ));
        } else {
            allPeople.add(Person.createFemale(words[1], date));
        }

        System.out.println(allPeople.size()-1);
    }

    public static void updatePeople(List<Person> allPeople, String[] words) {
        int numPeople = Integer.parseInt(words[1]);
        try {
            date = parseDate.parse(words[4]);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (words[3].equals("м"))
            allPeople.get(numPeople).setSex(Sex.MALE);
        else
            allPeople.get(numPeople).setSex(Sex.FEMALE);

        allPeople.get(numPeople).setName(words[2]);
        allPeople.get(numPeople).setBirthDate(date);

    }

    public static void deletePeople (List<Person> allPeople, String[] words) {
        int numPeople = Integer.parseInt(words[1]);
        allPeople.get(numPeople).setName(null);
        allPeople.get(numPeople).setSex(null);
        allPeople.get(numPeople).setBirthDate(null);
    }


}
