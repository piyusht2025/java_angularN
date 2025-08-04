package TEST;
interface I1{
    default void display() {
        System.out.println("I1 Display");
    }
}
interface I2{
    default void display() {
        System.out.println("I2 Display");
    }
}

class C1 implements I1 , I2{
    public  void display(){
        I1.super.display();
        I2.super.display();
        System.out.println("C1 Display");
    }
}
public class test2 {
    public static void main(String[] args) {
        new C1().display();

    }
}
