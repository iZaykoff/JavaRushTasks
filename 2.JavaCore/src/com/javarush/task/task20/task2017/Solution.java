package com.javarush.task.task20.task2017;

import java.io.*;

/*
Десериализация
*/
public class Solution {

    public A getOriginalObject(ObjectInputStream objectStream) {
        try {
            return objectStream.readObject() instanceof A ? (A) objectStream.readObject() : null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("1");
             ObjectOutputStream oos = new ObjectOutputStream(fos);
             FileInputStream fis = new FileInputStream("1");
             ObjectInputStream ois = new ObjectInputStream(fis)) {


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
