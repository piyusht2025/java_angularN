package Multithreading;


public class Main {
    public static Integer OrdersRemaining=4;
    public static void main(String[] args) {
        CustomerOrder order1 = new CustomerOrder("Processor0", 0,OrdersRemaining);
        CustomerOrder order2 = new CustomerOrder("Processor1", 1,OrdersRemaining);
        CustomerOrder order3 = new CustomerOrder("Processor2", 2,OrdersRemaining);
        CustomerOrder order4 = new CustomerOrder("Processor3", 3,OrdersRemaining);
        CustomerOrder order5 = new CustomerOrder("Processor4", 4,OrdersRemaining);
        CustomerOrder[] orders ={order1,order2,order3,order4,order5};
//        OrdersRemaining=orders.length;


        for(int i=0; i<5; i++){
            orders[i].start();
        }
        for(int i=0; i<5; i++) {
            try {
                orders[i].join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }

//            System.out.println("Orders Remaining: "+OrdersRemaining--);
        }

    }
}