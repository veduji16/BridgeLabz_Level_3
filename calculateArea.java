interface Shape {
    void input();

    void area();
}

class Circle implements Shape {
    int radius = 0;
    double pi = 3.14, result = 0;

    @Override
    public void input() {
        radius = 5;
    }

    @Override
    public void area() {
        result = pi * radius * radius;
        System.out.println("Area of circle: " + result);
    }
}

class Rectangle implements Shape {
    int length = 0, breadth = 0;
    double result;

    @Override
    public void input() {
        length = 10;
        breadth = 20;
    }

    @Override
    public void area() {
        result = length * breadth;
        System.out.println("Area of rectangle: " + result);
    }
}

public class calculateArea {
    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();
        Circle obj2 = new Circle();
        obj1.input();
        obj1.area();
        obj2.input();
        obj2.area();
    }
}