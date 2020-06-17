package com.javarush.task.task20.task2021;

import java.io.*;

/*
Сериализация под запретом
*/
public class Solution implements Serializable {
    public static class SubSolution extends Solution {
        private void writeObject(ObjectOutputStream o) throws NotSerializableException {
            throw new NotSerializableException();
        }

        private void readObject(ObjectInputStream o) throws NotSerializableException {
            throw new NotSerializableException();
        }
    }

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("1");
             ObjectOutputStream oos = new ObjectOutputStream(fos);
             FileInputStream fis = new FileInputStream("1");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            SubSolution sub = new SubSolution();
            oos.writeObject(sub);

            SubSolution sub0 = (SubSolution) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
