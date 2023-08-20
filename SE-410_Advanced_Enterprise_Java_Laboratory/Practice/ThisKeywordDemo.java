package Practice;

class MyClass {
    private int num;

    MyClass(int num) {
        this.num = num;
    }

    void display() {
        System.out.println("Value of num: " + num);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass(42);
        obj.display();
    }
}
