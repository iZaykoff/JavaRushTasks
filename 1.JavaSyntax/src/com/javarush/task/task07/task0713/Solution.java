package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listDivThree = new ArrayList<>();
        ArrayList<Integer> listDivTwo = new ArrayList<>();
        ArrayList<Integer> listAndAll = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0){
                listDivThree.add(list.get(i));
            }
            if (list.get(i) % 2 == 0){
                listDivTwo.add(list.get(i));
            }
            if (list.get(i) % 3 != 0 && list.get(i) % 2 != 0){
                listAndAll.add(list.get(i));
            }
        }

        printList(listDivThree);
        printList(listDivTwo);
        printList(listAndAll);

    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (Integer x : list){
            System.out.println(x);
        }
    }
}
