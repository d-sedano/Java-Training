package main.java.exercises.date_7_22;

public class TwoDArrayPractice {

	public static void main(String[] args) {
		
		int[][] matrix = {{2, 4, 6, 8}, {3, 6, 9, 12}, {4, 8, 12, 16}};

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println(matrix[i][j] + " ");
			}
		}
	}

}
