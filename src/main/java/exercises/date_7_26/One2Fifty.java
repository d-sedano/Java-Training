package main.java.exercises.date_7_26;

public class One2Fifty {

	public static void main(String[] args) {
		
		thisThread thread = new thisThread();
		thread.start();

	}

}

class thisThread extends Thread {
	public void run() {
		for (int i = 1; i <= 50; i++) {
			System.out.println(i);
		}
	}
}
