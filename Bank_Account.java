package Level_3;

class BankAcct {
    int principle = 200;
    int rate = 4;
    int time = 2;

    void test() {
        Interest innerObj = new Interest();
        innerObj.display();
    }

    class Interest {
        void display() {
            int si = (principle * rate * time) / 100;
            System.out.println("Interest: $" + si);
        }
    }
}

public class Bank_Account {
    public static void main(String[] args) {
        BankAcct outerObj = new BankAcct();
        outerObj.test();
    }
}