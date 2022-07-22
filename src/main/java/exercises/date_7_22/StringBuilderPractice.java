package main.java.exercises.date_7_22;

public class StringBuilderPractice {

	public static void main(String[] args) {
		
		StringBuilder build = new StringBuilder("new StringBuilder");
		
		build.append(" created");
		
		System.out.println(build.capacity());
		System.out.println(build.charAt(10));
		build.delete(0, 4);
		build.insert(0, "new ");
		System.out.println(build.reverse().length());

	}

}
