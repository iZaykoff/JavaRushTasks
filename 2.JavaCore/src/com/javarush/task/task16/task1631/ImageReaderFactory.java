package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader (ImageTypes type) {
        ImageReader toReturn = null;
        if (ImageTypes.BMP.equals(type)) {
            toReturn = new BmpReader();
        } else if (ImageTypes.JPG.equals(type)) {
            toReturn = new JpgReader();
        } else if (ImageTypes.PNG.equals(type)) {
            toReturn = new PngReader();
        } else {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        return toReturn;
    }
}
