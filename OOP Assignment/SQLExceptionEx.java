import java.sql.*;

public class SQLExceptionEx {
    public static void main(String[] args) {
        try {
            // Trying to connect to a non-existent database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nonexistentdb", "user", "password");
        } catch (SQLException e) {
            System.out.println("SQL Exception: " + e.getMessage());
        }
    }
}

