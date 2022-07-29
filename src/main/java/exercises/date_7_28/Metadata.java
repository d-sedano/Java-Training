package src.main.java.exercises.date_7_28;

public class Metadata {
	public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pstmt = null;

        try {

               con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "password");

               DatabaseMetaData dbData = con.getMetaData();            

               pstmt = con.prepareStatement("select * from employee where id =100");
               ResultSet rs = pstmt.executeQuery();

               while (rs.next()) {

                     ResultSetMetaData rsData = rs.getMetaData();
                      System.out.println(rsData.getColumnCount());
                      System.out.println(rsData.getColumnName(1) + ": " + rsData.getColumnTypeName(1));
                      System.out.println(rsData.getColumnName(2) + ": " + rsData.getColumnTypeName(2));
               }

        } catch (Exception e) {

               e.printStackTrace();
        } finally {

               try {                  

                     con.close();
               } catch (SQLException e) {

                     e.printStackTrace();
               }
        }
  }
}
