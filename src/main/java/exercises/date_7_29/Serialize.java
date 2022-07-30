package src.main.java.exercises.date_7_29;

public class Serialize {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

          Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "password");
          PreparedStatement pstmt = connection

                       .prepareStatement("INSERT INTO serialized_java_objects(obj_name, serialized_object) VALUES (?, ?)");

          pstmt.setString(1, "Employee");
          pstmt.setObject(2, new Employee(100, "Emp100", "pwd"));
          pstmt.executeUpdate();
          pstmt.close();

    }

}
