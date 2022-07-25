package main.java.exercises.date_7_25;

public class UncheckedEx {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5};
		
		try {
			System.out.println(displayIndex(array, 7));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static int displayIndex(int[] nums, int idx) throws ArrayIndexOutOfBoundsException {
		if (idx > nums.length) {
			throw new ArrayIndexOutOfBoundsException("Index larger than array length");
		}
		return nums[idx];
	}

}
