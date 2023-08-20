package Practice;

public class MultipleTryCatchDemo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[3] = 10; // ArrayIndexOutOfBoundsException

            int num = Integer.parseInt("abc"); // NumberFormatException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds");
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception");
        }
    }
}
