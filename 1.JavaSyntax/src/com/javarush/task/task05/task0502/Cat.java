package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int points1 = 0;
        int points2 = 0;

        if (this.weight > anotherCat.weight){
            points1 += 1;
        }else if (anotherCat.weight > this.weight){
            points2 += 1;
        }

        if (this.age > anotherCat.age){
            points1 += 1;
        }else if (anotherCat.age > this.age){
            points2 += 1;
        }

        if (this.strength > anotherCat.strength){
            points1 += 1;
        }else if (anotherCat.strength > this.strength){
            points2 += 1;
        }

        return points1 > points2;
    }

    public static void main(String[] args) {



    }
}
