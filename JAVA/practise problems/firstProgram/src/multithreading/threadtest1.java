package multithreading;

import Wrapper.Interger_test;

class test extends Thread{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i++ + "Hello");
        }
    }
}
public class threadtest1 {
    public static void main(String[] args) {
        System.out.printf("Hello 2$%d  1$%d ",10 ,20);
        /*test t=new test();
        t.start();
        int i=1;
        while(true){
            System.out.println(i++ + "world");
        }*/
    }
}
