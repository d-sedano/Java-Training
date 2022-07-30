package src.main.java.exercises.date_7_29;

public class ByteStream {

    public static void main(String[] args) {

          FileInputStream from = null;
          FileOutputStream to = null;
          int j = 0;

          try {
                 try {
                       from = new FileInputStream("C:\\daniel.sedano\\Downloads\\img1.png");
                       to = new FileOutputStream("C:\\daniel.sedano\\Downloads\\test.png");

                       while ((j = from.read()) != -1) {
                              to.write((byte) j);
                       }                     

                 } catch (FileNotFoundException e) {

                 }
                       e.printStackTrace();
                 } catch (IOException e) {

                       e.printStackTrace();

                 }

          } finally {

                 try {

                       if (from != null) {
                              from.close();
                       }
                       if (to != null) {
                              to.close();
                       }
                 } catch (IOException e) {

                       e.printStackTrace();
                 }

          }
}
