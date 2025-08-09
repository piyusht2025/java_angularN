package javaIO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {
    public static void main(String[] args) {
        File f = new File("/home/piyusht@id.argusoft.com/Desktop/java_angularN/JAVA/Practise/firstProgram/src/javaIO/text1.txt");
        Path p = Paths.get("/home/piyusht@id.argusoft.com/Desktop/java_angularN/JAVA/Practise/firstProgram/src/javaIO/text1.txt");
     //   Path filePath = Paths.get("path/to/your/file.txt");
        f.setReadOnly();
//        try {
//            Files.delete(p);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println(f.isFile());
    }
}
