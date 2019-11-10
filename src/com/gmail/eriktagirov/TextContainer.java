package com.gmail.eriktagirov;

import java.io.FileWriter;
import java.io.IOException;

@SaveTo(path = "d:\\JavaProFiles\\1.txt")
public class TextContainer {
    String str = "Hello World";

    @Saver
    public void save(String path) throws IOException {
        try (FileWriter fw = new FileWriter(path)) {
            fw.write(str);
        }
    }
}
