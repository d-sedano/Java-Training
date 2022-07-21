package main.java.exercises.date_7_20;

public class BreakEx {

	public static void main(String[] args) {
		for (int i = 50; i <= 100; i++) {
			if (i > 75) {
				break;
			}
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
