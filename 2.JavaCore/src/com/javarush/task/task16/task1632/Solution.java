package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    public static void main(String[] args) {
        threads.get(4).start();
    }

    static {
        threads.add(new MyThread01());
        threads.add(new MyThread02());
        threads.add(new MyThread03());
        threads.add(new MyThread04());
        threads.add(new MyThread05());
    }

    public static class MyThread01 extends Thread {

        @Override
        public void run() {
            while (true){}
        }
    }

    public static class MyThread02 extends Thread {

        @Override
        public void run() {
            while (true){
                try {
                    this.sleep(0);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }
        }
    }

    public static class MyThread03 extends Thread {

        @Override
        public void run() {
            try {
                while (true){
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static class MyThread04 extends Thread implements Message {

        @Override
        public void run() {
            while (!this.isInterrupted()){}
        }

        @Override
        public void showWarning() {
            this.interrupt();
        }
    }

    public static class MyThread05 extends Thread {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        private int count = 0;

        @Override
        public void run() {
            try {
                while (true){
                    String text = reader.readLine();
                    if (text.equals("N")){
                        break;
                    } else {
                        count += Integer.parseInt(text);
                    }
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(count);
        }
    }



}