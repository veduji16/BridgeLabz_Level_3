class Super {

    String str1;

    Super() {
        str1 = "Superclass String";
    }
}

class Sub extends Super {
    String str2;

    Sub() {
        str2 = "Subclass String";
    }

    void display() {
        System.out.println(str1);
        System.out.println(str2);
    }
}

public class SuperSub {
    public static void main(String[] args) {
        Sub obj = new Sub();
        obj.display();
    }
}