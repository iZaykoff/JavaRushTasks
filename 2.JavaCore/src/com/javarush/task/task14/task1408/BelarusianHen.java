package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 42;
    }

    @Override
    public String getDescription() {
        return String.format("%s Моя страна - %s. Я несу %s яиц в месяц.",super.getDescription(),BELARUS,getCountOfEggsPerMonth());
    }
}
