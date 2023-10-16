package OOPS;

abstract class Shape1 {
    abstract void draw();
}

class Circle1 extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square1 extends Shape {
    void draw() {
        System.out.println("Drawing a square");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape circle = new Circle1();
        Shape square = new Square1();

        circle.draw();
        square.draw();
    }
}

