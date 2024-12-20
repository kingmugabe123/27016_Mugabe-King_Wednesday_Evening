import java.io.*;

public class EOFExceptionEx {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("emptyfile.txt"))) {
            while (true) {
                System.out.println(dis.readUTF()); // Reading beyond file contents
            }
        } catch (EOFException e) {
            System.out.println("Reached the end of the file: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}

