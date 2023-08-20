package Practice;

import java.util.ArrayList;
import java.util.Date;

class Loan {
    // Implement Loan class if needed
}

class Circle {
    // Implement Circle class if needed
}

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Loan());
        list.add(new Date());
        list.add("Hello");
        list.add(new Circle());

        for (Object obj : list) {
            System.out.println(obj.toString());
        }
    }
}
