public class BankAccount {
    private int balance;
    int lowerBalance;
    public BankAccount(int balance,int lowerBalance){
        this.balance=balance;
        this.lowerBalance=lowerBalance;
    }
    int getBalance(){
        return this.balance;
    }
    public void deposit(int amount){
        balance+=amount;
        System.out.println("Amount deposited successfully ");
    }
    public void withdraw(int amount) throws InsufficientFundsException{
        if ((this.balance-amount) < (this.lowerBalance)){
            throw new InsufficientFundsException();
        }
        System.out.println("Withdrawn successful");
    }

}
