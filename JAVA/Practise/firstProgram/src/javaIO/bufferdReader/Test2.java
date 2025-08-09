package javaIO.bufferdReader;

import java.io.FileInputStream;

public class Test2 {
    public static void main(String[] args)throws Exception {
        FileInputStream f =new FileInputStream("/home/piyusht@id.argusoft.com/Desktop/" +
                "java_angularN/JAVA/Practise/firstProgram/src/javaIO/bufferdReader/text2.txt");
//        int a=f.available();
//        byte b[]=new byte[a];
//        f.read(b);
//        String s = new String(b);
//        System.out.println(s);
        int a ;
        while((a= f.read() )!=-1){
            System.out.print((char)(a)+"");
        }
    }
}
