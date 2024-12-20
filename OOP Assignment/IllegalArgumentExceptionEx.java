public class IllegalArgumentExceptionEx {
    public static void main(String[] args) {
        try {
            setAge(-1); // Invalid argument
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument: " + e.getMessage());
        }
    }

    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
    }
}
