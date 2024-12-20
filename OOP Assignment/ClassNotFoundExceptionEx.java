public class ClassNotFoundExceptionEx {
    public static void main(String[] args) {
        try {
            // Attempt to load a class that doesn't exist
            Class.forName("com.nonexistent.Class");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
