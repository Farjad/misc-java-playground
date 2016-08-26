package utils;

import com.google.common.io.Resources;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class File {
    public static String readFile(String fileName) throws IOException {
        return Resources.toString(Resources.getResource(fileName), Charset.defaultCharset());
    }

    public static ArrayList<String> readDir(String directory) throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        java.io.File folder = new java.io.File(directory);
        java.io.File[] listOfFiles = folder.listFiles();
        for (java.io.File file : listOfFiles) {
            if (file.isFile()) {
                list.add(file.getAbsolutePath());
            }
        }

        return list;
    }
}
