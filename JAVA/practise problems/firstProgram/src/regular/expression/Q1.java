package regular.expression;

public class Q1 {
    public static void main(String[] args) {
        String email="piyush.tarai@gmail.com";
        System.out.println(email.matches(".\\w*@gmail.\\w*"));
    }
}
