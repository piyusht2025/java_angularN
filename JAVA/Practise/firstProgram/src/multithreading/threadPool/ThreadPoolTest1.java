package multithreading.threadPool;

import java.math.BigInteger;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread implements Runnable{
    BigInteger v= BigInteger.valueOf(1);
    public void run(){
        for(int i=1;i<=2000;i++){
            v= v.multiply(BigInteger.valueOf(i));
        }
        System.out.println(v);
    }
}

public class ThreadPoolTest1 {
    public static void main(String[] args) throws InterruptedException {
        long start = System.nanoTime();
        int count=Runtime.getRuntime().availableProcessors();
        //System.out.println(count);
        ExecutorService es= Executors.newFixedThreadPool(count);

        for(int i=0;i<count;i++){
            es.execute(new MyThread());
        }
        /*MyThread m=new MyThread();
        Thread t= new Thread(m);
        t.start();*/
        Thread mainThread=Thread.currentThread();

        long end = System.nanoTime();
        System.out.println("total time taken = " + (double)(end-start)/(double)(1e9));
        mainThread.join();
    }
}
