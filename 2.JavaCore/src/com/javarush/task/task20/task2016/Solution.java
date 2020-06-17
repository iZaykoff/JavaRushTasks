package com.javarush.task.task20.task2016;

import java.io.*;

/*
Минимум изменений
*/
public class Solution {
    public class A implements Serializable {
        String name = "A";

        public A(String name) {
            this.name += name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public class B extends A {
        String name = "B";

        public B(String name) {
            super(name);
            this.name += name;
        }
    }

    public class C extends B {
        String name = "C";

        public C(String name) {
            super(name);
            this.name = name;
        }
    }

    public static void main(String[] args) {
//        try (FileOutputStream fos = new FileOutputStream("1");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            FileInputStream fis = new FileInputStream("1");
//            ObjectInputStream ois = new ObjectInputStream(fis)) {
//
//            C c = new C("S");
//            oos.writeObject(c);
//
//            C cS = (C) ois.readObject();
//            System.out.println(cS.name);
//
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
