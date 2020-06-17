package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        str = str.replaceAll(" ","");
        char[] wordLetter = str.toCharArray();

        List<Character> listVowels = new ArrayList<>();
        List<Character> listConsonants = new ArrayList<>();

        for (int i = 0; i < wordLetter.length; i++) {
            if (isVowel(wordLetter[i]))
                listVowels.add(wordLetter[i]);
            else
                listConsonants.add(wordLetter[i]);
        }

        printLetters(listVowels);
        printLetters(listConsonants);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }

    public static void printLetters(List list){
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}