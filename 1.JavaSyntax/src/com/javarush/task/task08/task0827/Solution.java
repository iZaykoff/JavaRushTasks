package com.javarush.task.task08.task0827;

import java.util.*;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        String[] parts = date.trim().split(" ");
        int dayOfYear = 0;
        switch (parts[0]){
            case ("JANUARY"): dayOfYear = 0; break;
            case ("FEBRUARY"): dayOfYear = 1; break;
            case ("MARCH"): dayOfYear = 2; break;
            case ("APRIL"): dayOfYear = 3; break;
            case ("MAY"): dayOfYear = 4; break;
            case ("JUNE"): dayOfYear = 5; break;
            case ("JULY"): dayOfYear = 6; break;
            case ("AUGUST"): dayOfYear = 7; break;
            case ("SEPTEMBER"): dayOfYear = 8; break;
            case ("OCTOBER"): dayOfYear = 9; break;
            case ("NOVEMBER"): dayOfYear = 10; break;
            case ("DECEMBER"): dayOfYear = 11; break;
        }

        Calendar calendar = new GregorianCalendar(Integer.valueOf(parts[2]),dayOfYear,Integer.valueOf(parts[1]));

        return calendar.get(Calendar.DAY_OF_YEAR) % 2 != 0;
    }
}
