package utils;

import com.google.common.io.Resources;

import java.io.IOException;
import java.nio.charset.Charset;

public class File {
    public static String readFile(String fileName) throws IOException {
        return Resources.toString(Resources.getResource(fileName), Charset.defaultCharset());
    }
}
