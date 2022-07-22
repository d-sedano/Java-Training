package main.java.exercises.date_7_22;

public class StringBufferPractice {

	public static void main(String[] args) {
		
		StringBuffer buff = new StringBuffer("Getting some practice with");
		
		buff.append(" StringBuffers");
		System.out.println(buff.insert(12, "extra"));
		System.out.println(buff.capacity());
		System.out.println(buff.reverse().length());
		System.out.println(buff.delete(8,  12));

	}

}
