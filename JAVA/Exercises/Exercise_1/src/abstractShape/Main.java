package abstractShape;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Shape Circle/Rectangle/Square or 0 for exit :");
        String s = sc.next();
        while (!s.equals("0")) {
            if (s.equals("Circle")) {
                System.out.println("Enter radius : ");
                Circle c = new Circle(sc.nextDouble());
                System.out.println("Circle Area = " + c.calculateArea());
            } else if (s.equals("Rectangle")) {
                System.out.println("Enter Length Breadth : ");
                Rectangle r = new Rectangle(sc.nextDouble(), sc.nextDouble());
                System.out.println("rectangle Area = " + r.calculateArea());
            } else if (s.equals("Square")) {
                System.out.println("ENter Side ");
                Square sq = new Square(sc.nextDouble());
                System.out.println("Area of square = " + sq.calculateArea());
            } else {
                System.out.println("Enter Valid shape");
            }
            System.out.println("Enter Shape Circle/Rectangle/Square or 0 for exit :");
            s = sc.next();
        }
        System.out.println("Exit");
    }
}
