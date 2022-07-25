package main.java.exercises.date_7_25;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedEx {

	public static void main(String[] args) throws FileNotFoundException {
		
	    File file = new File("/home/techvidvan/file.txt");
	    FileReader reader = new FileReader(file);
	    try {
			reader.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
