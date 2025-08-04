package pack1;

public class demo1
{
    public int a =10;
    int b =20;
    private int c =30;
    protected int d =40;
    void sum(){
        System.out.println(a+b+c+d);
    }

    public static void main(String[] args) {
        demo2 d2=new demo2();
        d2.display();
    }
}
class demo2
{
    demo1 d1=new demo1();
    void display(){
        System.out.println(d1.a+d1.a+d1.d);
    }
}
