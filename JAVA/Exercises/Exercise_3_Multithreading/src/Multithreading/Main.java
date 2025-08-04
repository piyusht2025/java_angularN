package Multithreading;

public class Main {
    public static void main(String[] args) {
        CustomerOrder order1 = new CustomerOrder("Processor0", 0);
        CustomerOrder order2 = new CustomerOrder("Processor1", 1);
        CustomerOrder order3 = new CustomerOrder("Processor2", 2);
        CustomerOrder order4 = new CustomerOrder("Processor3", 3);
        CustomerOrder order5 = new CustomerOrder("Processor4", 4);
        CustomerOrder[] orders ={order1,order2,order3,order4,order5};


        for(int i=0; i<5; i++){
            orders[i].start();
        }
        for(int i=0; i<5; i++) {
            try {
                orders[i].join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }
}