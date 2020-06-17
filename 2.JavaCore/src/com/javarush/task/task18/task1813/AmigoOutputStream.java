package com.javarush.task.task18.task1813;

import java.io.*;
import java.lang.invoke.MethodHandles;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";

    public static void main(String[] args) throws IOException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

    private FileOutputStream concept;

    public AmigoOutputStream(FileOutputStream concept) throws FileNotFoundException {
        super(String.valueOf(concept));
        this.concept = concept;
    }

    @Override
    public void flush() throws IOException {
        concept.flush();
    }

    @Override
    public void write(int b) throws IOException {
        concept.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        concept.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        concept.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        flush();
        String text = "JavaRush © All rights reserved.";
        write(text.getBytes());
        concept.close();
    }

    @Override
    public FileChannel getChannel() {
        return concept.getChannel();
    }

}
