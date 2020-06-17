package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        SpecialThread specialThread01 = new SpecialThread();
        list.add(new Thread(specialThread01));
        SpecialThread specialThread02 = new SpecialThread();
        list.add(new Thread(specialThread02));
        SpecialThread specialThread03 = new SpecialThread();
        list.add(new Thread(specialThread03));
        SpecialThread specialThread04 = new SpecialThread();
        list.add(new Thread(specialThread04));
        SpecialThread specialThread05 = new SpecialThread();
        list.add(new Thread(specialThread05));


    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
