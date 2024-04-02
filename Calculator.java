abstract class operationsMethods {
    abstract double add(double a, double b);

    abstract double subtract(double a, double b);

    abstract double multiply(double a, double b);

    abstract double divide(double a, double b);
}

class Operations extends operationsMethods {
    @Override
    double add(double a, double b) {
        return a + b;
    }

    @Override
    double subtract(double a, double b) {
        return a - b;
    }

    @Override
    double multiply(double a, double b) {
        return a * b;
    }

    @Override
    double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero!");
            return Double.NaN;
        }
    }
}

public class Calculator {
    public static void main(String[] args) {
        Operations calculator = new Operations();

        double num1 = 10.0;
        double num2 = 5.0;

        System.out.println("Addition: " + calculator.add(num1, num2));
        System.out.println("Subtraction: " + calculator.add(num1, num2));
        System.out.println("Multiplication: " + calculator.add(num1, num2));
        System.out.println("Division: " + calculator.add(num1, num2));
    }
}