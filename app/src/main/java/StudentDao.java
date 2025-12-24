
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    public static void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS students (id INTEGER PRIMARY KEY, name TEXT, age INTEGER, course TEXT)";
        try (Connection conn = DatabaseConnection.connect();
            Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertStudent(String name, int age, String course) {
        String sql = "INSERT INTO students(name, age, course) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, course);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students";
        try (Connection conn = DatabaseConnection.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                students.add(new Student(rs.getInt("ID"), rs.getString("Name"),rs.getString("Address"), rs.getString("Course"), rs.getInt("Age")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }
}
