package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.time.LocalDate;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        LocalDate date = LocalDate.now();
        System.out.printf("%d %d %d", date.getDayOfMonth(),date.getMonthValue(),date.getYear());
//        System.out.println("21 11 2019");
    }
}
