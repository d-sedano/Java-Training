package main.java.exercises.date_7_26;

public class TwoThreads {

	public static void main(String[] args) {
		
		OddThread odd = new OddThread();
		EvenThread even = new EvenThread();
		
		odd.start();
		even.start();

	}

}

class OddThread extends Thread {
	
	public void run() {
		
		for(int i = 1; i <= 50; i += 2) {
			System.out.println("First thread: " + i);
		}
	}
}

class EvenThread extends Thread {
	
	public void run() {
		
		for(int i = 2; i <= 50; i += 2) {
			System.out.println("Second thread: " + i);
		}
	}
}
