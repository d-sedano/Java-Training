package main.java.exercises.date_7_26;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		
		PortThread port = new PortThread();
		Thread t = new Thread(port);
		t.start();
		Thread.sleep(2000);
		Thread t2 = new Thread(port);
		t2.start();

	}

}

class PortThread implements Runnable {
	
	Dock dock = new Dock();
	
	Boolean occupied = false;
	
	public void run() {
		if (occupied == false) {
			dock.anchor(occupied);
		} else {
			dock.raiseAnchor(occupied);
		}
	}
	
}

class Dock {
	
	Boolean docked = false;
	
	synchronized void anchor(Boolean occupied) {
		if (!occupied) {
			docked = true;
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized void raiseAnchor(Boolean occupied) {
		if (occupied) {
			docked = false;
		}
	}
	
}
