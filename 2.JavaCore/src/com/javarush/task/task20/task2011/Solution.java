package com.javarush.task.task20.task2011;

import java.io.*;

/*
Externalizable для апартаментов
*/
public class Solution {

    public static class Apartment implements Externalizable {

        private String address;
        private int year;

        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment() {
            super();
        }

        public Apartment(String addr, int y) {
            address = addr;
            year = y;
        }

        /**
         * Prints out the fields used for testing!
         */
        public String toString() {
            return ("Address: " + address + "\n" + "Year: " + year);
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(address);
            out.writeInt(year);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            this.address = (String) in.readObject();
            this.year = in.readInt();
        }
    }

    public static void main(String[] args) {
        Apartment apartment = new Apartment("House",1500);

        try (FileOutputStream fs = new FileOutputStream("1");
             ObjectOutputStream oos = new ObjectOutputStream(fs);
             FileInputStream fis = new FileInputStream("1");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            oos.writeObject(apartment);

            Apartment apartment0 =  (Apartment) ois.readObject();
            System.out.println(apartment0.toString());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
