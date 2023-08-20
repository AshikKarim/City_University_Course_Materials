package Practice;

public class NestedTryCatchDemo {
    public static void main(String[] args) {
        try {
            try {
                int num = Integer.parseInt("abc"); // NumberFormatException
            } catch (NumberFormatException e) {
                System.out.println("Inner Catch: Number Format Exception");
            }

            int[] arr = new int[3];
            arr[3] = 10; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer Catch: Array Index Out Of Bounds");
        }
    }
}
