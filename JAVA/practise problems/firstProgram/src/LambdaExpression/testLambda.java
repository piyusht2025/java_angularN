package LambdaExpression;
interface test1{
    void display();
}
public class testLambda {
    public static void main(String[] args) {
        test1 t = new test1()
        {
            public void display(){
                System.out.println("DISPLAY");
            }
        };
        t.display();
        test1 t2 =()->{
            System.out.println("HELLO DISPLAY");
        };
        t2.display();
    }
}
