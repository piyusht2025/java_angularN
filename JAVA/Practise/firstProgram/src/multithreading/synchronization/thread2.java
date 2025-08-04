package multithreading.synchronization;

public class thread2 extends Thread{
    mydata d;
    thread2(mydata data){
        d=data;
    }
    public void run(){
        d.display("Welcome");
    }
}
