package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        StringBuffer stringBuffer = new StringBuffer();
        while (fileReader.ready()){
            stringBuffer.append(fileReader.readLine());
        }
        fileReader.close();

        Document doc = Jsoup.parse(stringBuffer.toString(),"",Parser.xmlParser());
        Elements element = doc.select(args[0]);
        for (Element elem : element) {
            System.out.println(elem);
        }

    }
}
