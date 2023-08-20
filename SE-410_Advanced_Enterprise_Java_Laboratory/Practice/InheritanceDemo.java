package Practice;
// Single Inheritance
class Parent {
    void displayParent() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void displayChild() {
        System.out.println("This is the child class.");
    }
}
/*
 //Multilevel Inheritance
class Grandparent {
    void displayGrandparent() {
        System.out.println("This is the grandparent class.");
    }
}

class Parent extends Grandparent {
    void displayParent() {
        System.out.println("This is the parent class.");
    }
}

class Child extends Parent {
    void displayChild() {
        System.out.println("This is the child class.");
    }
}*/
/*
// Hierarchical Inheritance
class Parent {
    void displayParent() {
        System.out.println("This is the parent class.");
    }
}

class Child1 extends Parent {
    void displayChild1() {
        System.out.println("This is the first child class.");
    }
}

class Child2 extends Parent {
    void displayChild2() {
        System.out.println("This is the second child class.");
    }
}*/

public class InheritanceDemo {
    public static void main(String[] args) {
        Child child = new Child();
        //child.displayGrandparent();
        child.displayParent();
        child.displayChild();
    }
}
