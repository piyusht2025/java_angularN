package Multithreading;

//import static Multithreading.Main.OrdersRemaining;

public class CustomerOrder extends Thread{
    private int orderNumber;
    static Integer OrdersRemaining=4;
   // private int s =0;
    public CustomerOrder(String s, int orderNumber,int OrdersRemaining) {
        super(s);
        this.orderNumber = orderNumber;
       // this.OrdersRemaining = OrdersRemaining;
    }

    public  void  run() {
        try {
            System.out.println(Thread.currentThread().getName() + " received order no." + orderNumber);
            System.out.println(Thread.currentThread().getName() + " Processing order..."+ orderNumber);
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        synchronized (OrdersRemaining){
        System.out.println(Thread.currentThread().getName() + ": Processing complete...."+ orderNumber +" Orders Remaining : "+OrdersRemaining--);
//        OrdersRemaining--;
//        System.out.println(Thread.currentThread().getName() + ": Processing complete...."+ orderNumber);
    }}
}
