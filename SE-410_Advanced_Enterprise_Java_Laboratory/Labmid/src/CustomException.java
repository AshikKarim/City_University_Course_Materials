class InvalidEmailIdException extends Exception {
    public InvalidEmailIdException(String message) {
        super(message);
    }
}

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

class Employee {
    private String name;
    private String email;
    private String phoneNumber;

    public Employee(String name, String email, String phoneNumber) throws InvalidEmailIdException, InvalidNumberException {
        if (!email.contains("@")) {
            throw new InvalidEmailIdException("Invalid email ID format. Email must contain '@'");
        }
        if (phoneNumber.length() < 11) {
            throw new InvalidNumberException("Invalid phone number format. Phone number must have at least 11 digits");
        }

        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "Name: " + name + "\nEmail: " + email + "\nPhone Number: " + phoneNumber;
    }
}

public class CustomException {
    public static void main(String[] args) {
        try {
            Employee emp1 = new Employee("John Doe", "john.doe@example.com", "12345678901");
            System.out.println(emp1);

            Employee emp2 = new Employee("Jane Smith", "jane.smithexample.com", "12345");
            System.out.println(emp2);
        } catch (InvalidEmailIdException e) {
            System.out.println("Invalid email ID: " + e.getMessage());
        } catch (InvalidNumberException e) {
            System.out.println("Invalid phone number: " + e.getMessage());
        }
    }
}
