package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> catSet = new HashSet<Cat>();
        //напишите тут ваш код
        Cat one = new Cat();
        Cat two = new Cat();
        Cat three = new Cat();
        Cat four = new Cat();
        catSet.add(one);
        catSet.add(two);
        catSet.add(three);
        catSet.add(four);
        return catSet;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> dogSet = new HashSet<>();
        Dog one = new Dog();
        Dog two = new Dog();
        Dog three = new Dog();
        dogSet.add(one);
        dogSet.add(two);
        dogSet.add(three);
        return dogSet;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> joinSet = new HashSet<>();
        joinSet.addAll(cats);
        joinSet.addAll(dogs);
        return joinSet;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object x : pets) {
            System.out.println(x);
        }
    }

    //напишите тут ваш код
    public static class Cat{

    }
    public static class Dog{

    }
}
