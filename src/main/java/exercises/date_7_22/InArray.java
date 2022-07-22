package main.java.exercises.date_7_22;

public class InArray {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int even = 0;
		int odd = 0;
		
		for (int i : arr) {
			if (i % 2 ==0) {
				even += i;
			} else {
				odd += 1;
			}
		}
		
		System.out.println(even + ", " + odd);
	}

}
