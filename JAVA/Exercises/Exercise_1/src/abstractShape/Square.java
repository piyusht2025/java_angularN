package abstractShape;

class Square extends Shape {
    double side;
    Square(double side){
        this.side=side;
    }

    @Override
    double calculateArea() {
        return side*side;
    }
}