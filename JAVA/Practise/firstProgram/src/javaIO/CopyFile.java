package javaIO;
//import java.*;
import java.nio.file.*;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.Path;

public class CopyFile {
    public static void main(String[] args)throws Exception {
        Path p1 = Paths.get("/home/piyusht@id.argusoft.com/Desktop/java_angularN/JAVA/Practise/firstProgram/src/javaIO/text1.txt");
        Path p2 = Paths.get("/home/piyusht@id.argusoft.com/Desktop/java_angularN/JAVA/Practise/firstProgram/src/javaIO/text2.txt");
        Files.copy(p1,p2);
       // Files.copy(p1,p2,)

    }
}
