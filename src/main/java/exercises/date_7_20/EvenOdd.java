package main.java.exercises.date_7_20;

public class EvenOdd {
	
	public static String toCheck;
	
	public static void main(String[] args) {
		toCheck = args[0];
		check(toCheck);
	}
	
	public static void check(String i) {
		if (Integer.parseInt(i) % 2 == 0) {
			System.out.println(toCheck + " is an even number!");
		} else {
			System.out.println(toCheck + " is an odd number!");
		}
	}
	
}
