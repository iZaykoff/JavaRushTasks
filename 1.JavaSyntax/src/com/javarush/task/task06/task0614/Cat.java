package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<>();
    //напишите тут ваш код

    public Cat() {
    }

    public static void main(String[] args) {
        Cat one = new Cat();
        Cat.cats.add(one);
        Cat two = new Cat();
        Cat.cats.add(two);
        Cat three = new Cat();
        Cat.cats.add(three);
        Cat four = new Cat();
        Cat.cats.add(four);
        Cat five = new Cat();
        Cat.cats.add(five);
        Cat six = new Cat();
        Cat.cats.add(six);
        Cat seven = new Cat();
        Cat.cats.add(seven);
        Cat eight = new Cat();
        Cat.cats.add(eight);
        Cat nine = new Cat();
        Cat.cats.add(nine);
        Cat ten = new Cat();
        Cat.cats.add(ten);

        //напишите тут ваш код
        printCats();
    }

    public static void printCats() {
        for (int i = -1; i <Cat.cats.size()-1 ; i++) {
            System.out.println(Cat.cats.get(i+1));

        }
        //напишите тут ваш код
    }
}
