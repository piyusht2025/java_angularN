package multithreading.synchronization;

public class testMain {
    public static void main(String[] args) {
        mydata d =new mydata();
        thread1 t=new thread1(d);
        thread2 t2=new thread2(d);
        t.start();
        t2.start();
    }
}
