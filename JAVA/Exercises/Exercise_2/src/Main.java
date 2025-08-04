import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount A1=new BankAccount(20000,1000);
        Scanner sc=new Scanner(System.in);
        int choose=0;
        int amount=0;
        System.out.println("Available Balance : "+A1.getBalance());
        do{
            System.out.print("Enter 1 for withdraw , 2 for deposit , 3 for exit :\n");

            choose=sc.nextInt();
            if (choose==1){
                System.out.println("Enter amount you want to withdraw : ");
                amount=sc.nextInt();
                try{
                    A1.withdraw(amount);
                }
                catch (InsufficientFundsException e) {
                    System.out.println(e);;
                }
                finally {
                    System.out.println("Available Balance : "+A1.getBalance());
                }
            }if (choose==2){
                System.out.println("Enter amount you want to deposit : ");
                amount=sc.nextInt();
                A1.deposit(amount);
                System.out.println("Available Balance : "+A1.getBalance());

            }
        }while(choose==1 || choose==2);
    }
}