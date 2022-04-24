abstract class Shape {
    abstract void numberOfSides();
}

class Rectangle extends Shape {
    void numberOfSides() {
        System.out.println("Number of sides of a rectangle: 4");
    }
}

class Triangle extends Shape {
    void numberOfSides() {
        System.out.println("Number of sides of a triangle: 3");
    }
}

class Hexagon extends Shape {
    void numberOfSides() {
        System.out.println("Number of sides of a Hexagon: 6");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Shape obj;
        obj = new Rectangle();
        obj.numberOfSides();
        obj = new Triangle();
        obj.numberOfSides();
        obj = new Hexagon();
        obj.numberOfSides();
    }
}
