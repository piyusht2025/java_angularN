package Multithreading;

public class CustomerOrder extends Thread{
    private int orderNumber;
   // private int s =0;
    public CustomerOrder(String s, int orderNumber) {
        super(s);
        this.orderNumber = orderNumber;
    }
    public void  run() {
        synchronized (this){
            try {
                System.out.println(Thread.currentThread().getName() + " received order no." + orderNumber);
                System.out.println(Thread.currentThread().getName() + " Processing order...");
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            System.out.println(Thread.currentThread().getName() + ": Processing complete...." );
        }
    }
}
