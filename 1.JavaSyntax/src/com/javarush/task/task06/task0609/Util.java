package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        double a = x1 - x2;
        double b = y1 - y2;
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }

    public static void main(String[] args) {

    }
}
