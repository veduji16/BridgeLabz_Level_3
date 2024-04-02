public class ConstructorChaining {
    private int x;
    private int y;

    public ConstructorChaining() {
        this.x = 20;
        System.out.println("Default constructor called. x = " + this.x);
    }

    public ConstructorChaining(int x) {
        this.x = x;
        System.out.println("Paramertized constructor called with x = " + this.x);
    }

    public ConstructorChaining(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Paramertized constructor called with x = " + this.x + " and y = " + this.y);
        System.out.println("Sum of x and y = " + (this.x + this.y));
    }

    public static void main(String[] args) {
        ConstructorChaining obj = new ConstructorChaining(11, 12);
    }
}