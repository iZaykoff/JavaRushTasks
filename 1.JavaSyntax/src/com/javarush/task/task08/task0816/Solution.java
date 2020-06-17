package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Сталлон", dateFormat.parse("JUNE 1 2012"));
        map.put("Сталло", dateFormat.parse("JUNE 1 2012"));
        map.put("Сталл", dateFormat.parse("MAY 1 2012"));
        map.put("Стал", dateFormat.parse("JUNE 1 2012"));
        map.put("Ста", dateFormat.parse("JUL 1 2012"));
        map.put("Ст", dateFormat.parse("MAY 1 2012"));
        map.put("С", dateFormat.parse("JUNE 1 2012"));
        map.put("Саллоне", dateFormat.parse("MAY 1 2012"));
        map.put("Салоне", dateFormat.parse("AUG 1 2012"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) throws ParseException {
        //напишите тут ваш код
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Date dateAfter = dateFormat.parse("MAY 30 2012");
        Date dateBefore = dateFormat.parse("AUG 31 2012");

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            Date date = pair.getValue();
            if (date.before(dateBefore) && date.after(dateAfter)){
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) throws ParseException {
        removeAllSummerPeople(createMap());

    }
}
