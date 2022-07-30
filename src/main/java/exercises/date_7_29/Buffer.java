package src.main.java.exercises.date_7_29;

public class Buffer {

	 

    public static void main(String[] args) {

          BufferedReader r = null;
          BufferedWriter w = null;

          try {
                 Reader reader = new FileReader("C:\\daniel.sedano\\Downloads\\Day9.txt");
                 r = new BufferedReader(reader);
                 String line = null;

                 File out = new File("C:\\daniel.sedano\\Downloads\\testFile.txt");
                 Writer writer = new FileWriter(out);
                 w = new BufferedWriter(writer);

                 while ((line = r.readLine()) != null) {
                       w.write(line);
                       w.flush();
                 }

          } catch (IOException e) {

                 e.printStackTrace();
          } finally {

                 try {

                       r.close();
                       w.close();
                 } catch (IOException e) {

                       e.printStackTrace();
                 }
          }

    }



}
