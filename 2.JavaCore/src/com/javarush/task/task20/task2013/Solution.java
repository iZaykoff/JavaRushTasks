package com.javarush.task.task20.task2013;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Externalizable Person
*/
public class Solution {
    public static class Person implements Externalizable {
        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;

        public Person(){super();}

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(firstName);
            out.writeObject(lastName);
            out.writeObject(father);
            out.writeObject(mother);
            out.writeInt(age);
            out.writeObject(children);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            firstName = (String) in.readObject();
            lastName = (String) in.readObject();
            father = (Person) in.readObject();
            mother = (Person) in.readObject();
            age = in.readInt();
            children = (List) in.readObject();
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Ivan","Ivanov",33);
        person.setFather(new Person("Pap","Pap",60));
        person.setMother(new Person("Mom","Mom",55));
        List<Person> childPersons = new ArrayList<>();
        childPersons.add(new Person());
        childPersons.add(new Person());
        childPersons.add(new Person());
        person.setChildren(childPersons);

        try (FileOutputStream fos = new FileOutputStream("1");
             ObjectOutputStream oos = new ObjectOutputStream(fos);
             FileInputStream fis = new FileInputStream("1");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            oos.writeObject(person);

            Person person0 = (Person) ois.readObject();
            System.out.println(person0.firstName + "\n" + person0.lastName + "\n" + person0.age + "\n" + person.father.age);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
