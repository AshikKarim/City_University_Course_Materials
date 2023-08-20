package Practice;

public class CommandLineArgsDemo {
    public static void main(String[] args) {
        try {
            if (args.length == 1) {
                throw new Exception("Only one argument provided.");
            } else if (args.length == 2) {
                int dividend = Integer.parseInt(args[0]);
                int divisor = Integer.parseInt(args[1]);

                if (divisor == 0) {
                    throw new ArithmeticException("Division by zero.");
                }

                int result = dividend / divisor;
                System.out.println("Result: " + result);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
