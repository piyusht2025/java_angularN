package exceptionhandling;

public class TestFinally {
    static void divide() {
        try{
            int a=10/0;
        }
        catch (IndexOutOfBoundsException e ){
            System.out.println("Divide by 0");
        }

        System.out.println("Will it get displayed");
    }static void divide2() {
        try{
            int a=10/0;
        }
        catch (IndexOutOfBoundsException e ){
            System.out.println("Divide by 0");
        }
        finally {
            System.out.println("Will it get displayed");
        }

    }
    public static void main(String[] args) {
        //divide();
       // divide2();
    }
}
