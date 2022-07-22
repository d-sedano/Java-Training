package main.java.exercises.date_7_22;

public class StringPractice {

	public static void main(String[] args) {
		
		String str = "str";
		String strr = "strr";
		
		String strrr = str.concat(strr).concat("prrr");
		System.out.println(strrr.toUpperCase().charAt(1));
		System.out.println(strrr.toLowerCase().charAt(1));
		System.out.println(strrr.length());
		
		System.out.println(strrr.substring(3) + strrr.substring(3, 4));
		System.out.println(strrr.contains("rr"));
		String strrrr = String.join("here", "is", "an", "example");
		System.out.println(strrrr.trim());
		
		for (char c : strrr.toCharArray()) {
			System.out.println(c);
		}
	}

}
