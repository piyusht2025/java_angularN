package multithreading.synchronization;

public class mydata {
   /* void display(String s){
        synchronized (this){                         // for synchronizing each thread
        for (int i =0; i < s.length() ; i++){
            System.out.print(s.charAt(i) + " ");
        }}
    }*/
    synchronized void display(String s){
          for (int i =0; i < s.length() ; i++){
                System.out.print(s.charAt(i) + " ");
          }
    }
}
