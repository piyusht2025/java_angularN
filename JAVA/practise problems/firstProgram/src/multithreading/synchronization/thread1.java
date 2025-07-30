package multithreading.synchronization;

public class thread1 extends Thread{
    mydata d ;
    thread1(mydata data){
        d=data;
    }
    public void run(){
        d.display("Hello World");
    }
}
