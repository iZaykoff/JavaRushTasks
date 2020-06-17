package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();

        if (firstName.equals(secondName)){
            System.out.println("Имена идентичны");
        } else if (firstName.length() == secondName.length()){
            System.out.println("Длины имен равны");
        }

    }
}
