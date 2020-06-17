package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        Date date = null;

        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = formatDate.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        formatDate = new SimpleDateFormat("MMM dd, yyyy",Locale.ENGLISH);
        str = formatDate.format(date);

        System.out.println(str.toUpperCase());



    }
}
