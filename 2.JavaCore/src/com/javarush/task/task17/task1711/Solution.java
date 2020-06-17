package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();
    public static Date date;
    public static SimpleDateFormat parseDate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {

        switch (args[0]){
            case "-c":
                synchronized (allPeople){
                    createAndAddPeople(allPeople, args);
                }
                break;
            case "-u":
                synchronized (allPeople){
                    updatePeople(allPeople, args);
                }
                break;
            case "-d":
                synchronized (allPeople){
                    deletePeople(allPeople, args);
                }
                break;
            case "-i":
                synchronized (allPeople){
                    if (args.length > 2){
                        for (int i = 1; i < args.length; i++) {
                            int numPeople = Integer.parseInt(args[i].replaceAll("[^\\d]",""));
                            formatPrint(allPeople,numPeople);
                        }
                    } else {
                        int numPeople = Integer.parseInt(args[1].replaceAll("[^\\d]",""));
                        formatPrint(allPeople,numPeople);
                    }
                }
                break;
        }
    }

    public static void formatPrint (List<Person> allPeople, int numPeople){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);
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
        if (words.length > 2) {
            for (int i = 1; i < words.length; i+=3) {
                try {
                    date = parseDate.parse(words[i+2]);
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                if (words[i+1].equals("м")) {
                    allPeople.add(Person.createMale(words[i], date ));
                } else {
                    allPeople.add(Person.createFemale(words[i], date));
                }
                System.out.println(allPeople.size()-1);
            }
        } else {
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

    }

    public static void updatePeople(List<Person> allPeople, String[] words) {
        if (words.length > 2){
            for (int i = 1; i < words.length; i += 4) {
                int numPeople = Integer.parseInt(words[i].replaceAll("[^\\d]", ""));
                try {
                    date = parseDate.parse(words[i+3]);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                if (words[i+2].equals("м"))
                    allPeople.get(numPeople).setSex(Sex.MALE);
                else
                    allPeople.get(numPeople).setSex(Sex.FEMALE);
                allPeople.get(numPeople).setName(words[i+1]);
                allPeople.get(numPeople).setBirthDate(date);
            }
        } else {
            int numPeople = Integer.parseInt(words[1].replaceAll("[^\\d]", ""));
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
    }

    public static void deletePeople (List<Person> allPeople, String[] words) {
        if (words.length > 2){
            for (int i = 1; i < words.length; i++) {
                int numPeople = Integer.parseInt(words[i].replaceAll("[^\\d]", ""));
                allPeople.get(numPeople).setName(null);
                allPeople.get(numPeople).setSex(null);
                allPeople.get(numPeople).setBirthDate(null);
            }
        } else {
            int numPeople = Integer.parseInt(words[1].replaceAll("[^\\d]", ""));
            allPeople.get(numPeople).setName(null);
            allPeople.get(numPeople).setSex(null);
            allPeople.get(numPeople).setBirthDate(null);
        }
    }


}
