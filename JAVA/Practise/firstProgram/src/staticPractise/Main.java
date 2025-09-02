package staticPractise;

class A{
    int b =10;
    static int a=10;
    static{
        a++;
        System.out.println("A= "+a);
    }
    {
        b++;
        System.out.println("B= "+b);
    }
}
public class Main {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(A.a);
        System.out.println("----------");
        A b=new A();
        System.out.println(A.a);
    }
}
