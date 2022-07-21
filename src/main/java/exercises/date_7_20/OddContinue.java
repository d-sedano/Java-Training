package main.java.exercises.date_7_20;

public class OddContinue {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
