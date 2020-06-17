package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream out = System.out;
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(arrayOutputStream);
        System.setOut(ps);
        testString.printSomething();
        System.setOut(out);

        String[] text = arrayOutputStream.toString().split(" ");
        int sum;
        switch (text[1]){
            case "+":
                sum = Integer.parseInt(text[0]) + Integer.parseInt(text[2]);
                System.out.printf("%s + %s = %d",text[0],text[2],sum);
                break;
            case "-":
                sum = Integer.parseInt(text[0]) - Integer.parseInt(text[2]);
                System.out.printf("%s - %s = %d",text[0],text[2],sum);
                break;
            case "*":
                sum = Integer.parseInt(text[0]) * Integer.parseInt(text[2]);
                System.out.printf("%s * %s = %d",text[0],text[2],sum);
                break;
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

