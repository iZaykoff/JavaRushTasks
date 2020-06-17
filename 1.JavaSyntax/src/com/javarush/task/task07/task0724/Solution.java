package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human one = new Human("Tod",true,55);
        Human two = new Human("Mary",false,50);
        Human three = new Human("Bob",true,50);
        Human four = new Human("Bony",false,48);
        Human five = new Human("Tom",true,30,one,two);
        Human six = new Human("Joly",false,23,three,four);
        Human seven = new Human("Lily",false,21,five,six);
        Human eight = new Human("Rob",true,18,five,six);
        Human nine = new Human("Katy",false,13,five,six);

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
        System.out.println(eight);
        System.out.println(nine);
    }

    public static class Human {
        // напишите тут ваш код
        private String name;
        private boolean sex = true;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}