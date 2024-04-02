public class OuterClass {
    static String message = "Hello from InnerClass!";

    static class InnerClass {
        public void show() {
            System.out.println("InnerClass says: " + message);
        }
    }

    public static void main(String[] args) {
        InnerClass innerInstance = new InnerClass();

        innerInstance.show();

        OuterClass.InnerClass anotherInstance = new OuterClass.InnerClass();
        anotherInstance.show();
    }
}