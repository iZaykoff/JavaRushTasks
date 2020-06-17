package com.javarush.task.task19.task1911;

/* 
Ридер обертка
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();
//    // сохраняем System.out в свою переменную out
//    PrintStream out = System.out;
//
//    // добавляем stream к файлу
//    PrintStream ps = new PrintStream("file.txt");
//
//    // переопределяем System.out, для записи в наш файл вместо консоли
//    System.setOut(ps);
//
//    // эта строка добавится в файл
//    System.out.println("New text to our file.txt");
//
//    // переопределяем System.out обратно
//    System.setOut(out);
//
//    // эта строка уже выведится в консоле, как обычно
//    System.out.println("Output back to console");

    public static void main(String[] args) {
        PrintStream out = System.out;

        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();

        PrintStream ps = new PrintStream(arrayOutputStream);

        System.setOut(ps);

        testString.printSomething();

        System.setOut(out);

        String text = arrayOutputStream.toString().toUpperCase();

        System.out.println(text);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
