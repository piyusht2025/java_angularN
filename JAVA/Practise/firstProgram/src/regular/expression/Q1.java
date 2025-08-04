package regular.expression;

import java.util.regex.Pattern;

public class Q1 {
    public static void main(String[] args) {
        String REGEX=".*gmail\\..*";
        Pattern p = Pattern.compile(REGEX);
        String email="piyush@gmail.yahoo";
        System.out.println(Pattern.matches(email,REGEX));
    }
}
