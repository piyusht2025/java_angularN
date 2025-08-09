package javaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class Copytolowercase {
    public static void main(String[] args)throws Exception {
        FileInputStream f1=new FileInputStream("text1.txt");
        FileOutputStream f2=new FileOutputStream("text2.txt");
       // SequenceInputStream s=new SequenceInputStream(f1,f2);

    }
}
