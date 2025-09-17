
// 5: Class Inheritance

// Create a class Shape with a constructor that takes width and height as parameters. Then, create a class Rectangle that inherits from Shape and has a method getArea that calculates the area (width * height).


class Shape{
    constructor(width,height){
        this.width=width
        this.height=height
    }

}

class Rectangle extends Shape{
    constructor(width,height){
        super(width,height)

    }

    getArea(){
        return (this.height*this.width)
    }
}

let r = new Rectangle(10,20);
console.log(r.getArea());

