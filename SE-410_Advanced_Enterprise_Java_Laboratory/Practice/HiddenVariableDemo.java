package Practice;

class A {
    static int x = 10;
}

class B extends A {
    int x = 20;

    void display() {
        System.out.println("Hidden x in B: " + this.x); // Accessing instance variable x in class B
        System.out.println("x in A: " + A.x); // Accessing static variable x in class A
    }
}

public class HiddenVariableDemo {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
