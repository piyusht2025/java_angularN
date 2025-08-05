package abstractShape;

import java.sql.SQLOutput;
import java.util.Scanner;

abstract class shape{
    abstract double calculateArea();
}

class circle extends shape {
    double radius;
    circle(double r){

        radius=r;
    }
    @Override
    double calculateArea() {
        return (Math.PI*radius*radius);
    }
}
class rectangle extends shape {
    double length;
    double breadth;
    rectangle(double l,double b){
        length=l;
        breadth=b;
    }
    @Override
    double calculateArea() {
        return length*breadth;
    }
}
class square extends shape {
    double side;
    square(double side){
        this.side=side;
    }

    @Override
    double calculateArea() {
        return side*side;
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Shape Circle/Rectangle/Square or 0 for exit :");
        String s = sc.next();
        while(!s.equals("0") ) {
            if (s.equals("Circle")) {
                System.out.println("Enter radius : ");
                circle c = new circle(sc.nextDouble());
                System.out.println("Circle Area = " + c.calculateArea());
            } else if (s.equals("Rectangle")) {
                System.out.println("Enter Length Breadth : ");
                rectangle r = new rectangle(sc.nextDouble(), sc.nextDouble());
                System.out.println("rectangle Area = " + r.calculateArea());
            } else if (s.equals("Square")) {
                System.out.println("ENter Side ");
                square sq = new square(sc.nextDouble());
                System.out.println("Area of square = " + sq.calculateArea());
            } else {
                System.out.println("Enter Valid shape");
            }
            System.out.println("Enter Shape Circle/Rectangle/Square or 0 for exit :");
            s = sc.next();
        }
        System.out.println("Exit");
    }
    /* Objective:
Model different geometric shapes using abstraction and calculate their areas.

🔐 Rules:

Create an abstract class Shape with an abstract method calculateArea().

Create subclasses Circle, Rectangle, and Square, each implementing the calculateArea() method.

🧱 Requirements:

Prompt the user to choose a shape (Circle, Rectangle, or Square).

Based on the shape, prompt for relevant dimensions (radius for circle,
length and width for rectangle, side length for square).

Calculate and display the area of the selected shape.

✅ Optional:

Add more shapes like Triangle and Hexagon.

Use a loop to allow multiple calculations.*/
}
