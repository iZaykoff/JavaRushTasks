package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

public class Solution {
    public static Cat cat;

    public static class Cat{

        public void setName(String name) {
            this.name = name;
        }

        public String name;
    }

    static {
        cat = new Cat();
        cat.setName("Murka");
        System.out.println(cat.name);
    }

    public static void main(String[] args) {

    }
}
