package generics;

public class Test2 {
    static <E> void show(E e){
        System.out.println(e);
    }
    public static void main(String[] args) {
        show(10);
        show("hello");
    }
}
