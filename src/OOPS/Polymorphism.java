package OOPS;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();

        circle.draw();
        square.draw();
    }
}
