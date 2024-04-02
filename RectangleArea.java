public class RectangleArea {

    public static void calculateArea(double length, double breadth) {
        double area = length * breadth;
        System.out.printf("Area of the recatangle with length %.2f and breadth %.2f is %.2f%n", length, breadth, area);
    }

    public static void main(String[] args) {
        double length = 5.0;
        double breadth = 3.0;
        calculateArea(length, breadth);
    }
}

