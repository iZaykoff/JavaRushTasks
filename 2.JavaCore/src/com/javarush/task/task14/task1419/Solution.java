package com.javarush.task.task14.task1419;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        try {
            Integer i = null;
            if (i == 0)
                i = 1;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] arr = new int[3];
            for (int i = -1; i < arr.length; i++) {
                int j = arr[i];
            }
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            InputStream inputStream = new FileInputStream("as");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Class.forName("JDBCdriver");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Integer.parseInt(null);
        } catch (Exception e){
            exceptions.add(e);
        }

        try {
            int[] arr = new int[-1];
        } catch (Exception e){
            exceptions.add(e);
        }

        try {
            Object[] arr = new String[2];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = new Integer(0);
            }
        } catch (Exception e){
            exceptions.add(e);
        }

        try {
            Object o = new Integer(1);
            System.out.println((char)o);
        } catch (Exception e){
            exceptions.add(e);
        }

        try {
            String s = "as";
            s.charAt(5);
        } catch (Exception e){
            exceptions.add(e);
        }

    }
}
