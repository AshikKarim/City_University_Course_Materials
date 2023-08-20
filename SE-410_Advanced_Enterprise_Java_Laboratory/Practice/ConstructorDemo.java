package Practice;

class Person {
    String name;
    int age;

    // Overloaded Constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Copy Constructor
    Person(Person p) {
        name = p.name;
        age = p.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Nayon", 25);
        Person person2 = new Person(person1); // Using the copy constructor
        person1.display();
        person2.display();
    }
}

