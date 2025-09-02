package abstractShape;

class Circle extends Shape {
    double radius;
    Circle(double r){

        radius=r;
    }
    @Override
    double calculateArea() {
        return (Math.PI*radius*radius);
    }
}