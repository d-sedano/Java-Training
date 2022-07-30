package src.main.java.exercises.date_7_29;

public class CharReadWrite {

    public static void main(String[] args) {

          FileReader in = null;
          FileWriter out = null;

          try {
                 in = new FileReader("C:\\daniel.sedano\\Downloads\\Day9.txt");
                 out = new FileWriter("C:\\daniel.sedano\\Downloads\\testFile.txt");

                 int c = 0;
                 while ((c = in.read()) != -1) {
                       out.write(c);
                 }
          } catch (IOException e) {

                 e.printStackTrace();
          } finally {

                 try {

                       if (in != null) {
                              in.close();
                       }
                       if (out != null) {
                              out.close();
                       }
                 } catch (IOException e) {

                      e.printStackTrace();
                 }

          }

    }

}
