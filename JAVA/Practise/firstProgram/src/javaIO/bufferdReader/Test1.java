package javaIO.bufferdReader;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Test1 {
    public static void main(String[] args) throws Exception{
        FileOutputStream f= new FileOutputStream("/home/piyusht@id.argusoft.com/Desktop/java_angularN/JAVA/Practise/firstProgram/src/javaIO/bufferdReader/text2.txt");
        PrintStream p = new PrintStream(f);
        p.println("Written using PrintStream");
        p.println("2");
        p.print("3 . Third Line");

    }
}
