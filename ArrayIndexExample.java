package ArrayIndexExample;

public class ArrayIndexExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            
            System.out.println("Accessing element at index 10: " + numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index access!");
        }
    }
}
