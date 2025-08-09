package abstractShape;

class Rectangle extends Shape {
    double length;
    double breadth;
    Rectangle(double l,double b){
        length=l;
        breadth=b;
    }
    @Override
    double calculateArea() {
        return length*breadth;
    }
}