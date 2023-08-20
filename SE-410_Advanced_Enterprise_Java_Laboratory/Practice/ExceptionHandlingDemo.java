package Practice;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000); // InterruptedException

            int num = Integer.parseInt("abc"); // NumberFormatException
        } catch (InterruptedException e) {
            System.out.println("Interrupted Exception");
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
