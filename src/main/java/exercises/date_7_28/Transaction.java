package src.main.java.exercises.date_7_28;

public class Transaction {
	public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {

               Driver myDriver = new com.mysql.cj.jdbc.Driver();
               DriverManager.registerDriver(myDriver);
               con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "password");

               stmt = con.createStatement();                

               rs = stmt.executeQuery("select * from employee");
               System.out.println(rs.getInt(1) + " " + rs.getString(2));

               int count = stmt.executeUpdate("update employee set name = 'FirstEmployee' where id =1;");
               System.out.println(count);

               stmt.addBatch("insert into training.employee values (200, 'emp200')");

        } catch (Exception e) {

               e.printStackTrace();
        } finally {

               rs.close();
               stmt.close();
               con.close();

        }
  }
}
