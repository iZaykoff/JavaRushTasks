package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> children = new ArrayList<>();
        children.add(new Human("Pops", true, 12));
        children.add(new Human("Pampl", false, 15));
        children.add(new Human("Popy", false, 17));

        ArrayList<Human> childF = new ArrayList<>();
        childF.add(new Human("Vasya", true, 30,children));

        ArrayList<Human> childM = new ArrayList<>();
        childM.add(new Human("Mishel", false, 27,children));

        Human grandPa = new Human("Igor",true, 56, childF);
        Human grandPa2 = new Human("Petya",true, 55, childF);
        Human grandMa = new Human("Mary",false, 50, childM);
        Human grandMa2 = new Human("Inga",false, 52, childM);
        System.out.println(grandPa);
        System.out.println(grandPa2);
        System.out.println(grandMa);
        System.out.println(grandMa2);
        for (Human human : childF) {
            System.out.println(human);
        }
        for (Human human : childM) {
            System.out.println(human);
        }
        for (Human child : children) {
            System.out.println(child);
        }

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();


        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.addAll(children);
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
