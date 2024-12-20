public class NumberFormatExceptionEx {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("abc"); // Invalid string format for number
        } catch (NumberFormatException e) {
            System.out.println("Number format exception: " + e.getMessage());
        }
    }
}

