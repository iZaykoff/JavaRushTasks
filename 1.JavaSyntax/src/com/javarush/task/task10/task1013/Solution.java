package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String firstName;
        private String lastName;
        private boolean sex;
        private int age;
        private double hight;
        private double weght;

        public Human(String firstName) {
            this.firstName = firstName;
        }

        public Human(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(String firstName, String lastName, boolean sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
        }

        public Human(String firstName, String lastName, boolean sex, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
        }

        public Human(String firstName, String lastName, boolean sex, int age, double hight) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
            this.hight = hight;
        }

        public Human(String firstName, String lastName, boolean sex, int age, double hight, double weght) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
            this.hight = hight;
            this.weght = weght;
        }

        public Human(String firstName, boolean sex) {
            this.firstName = firstName;
            this.sex = sex;
        }

        public Human(String firstName, int age) {
            this.firstName = firstName;
            this.age = age;
        }

        public Human(String firstName, boolean sex, int age) {
            this.firstName = firstName;
            this.sex = sex;
            this.age = age;
        }

        public Human(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }
    }
}
