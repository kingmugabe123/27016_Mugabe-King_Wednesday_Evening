public class NullPointerExceptionEx{
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length()); // Accessing a null reference
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception: " + e.getMessage());
        }
    }
}
