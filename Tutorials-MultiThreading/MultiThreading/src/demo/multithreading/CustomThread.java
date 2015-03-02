package demo.multithreading;

public class CustomThread extends Thread {

	CustomThread(String name) {
		super(name);
		start();
	}

	public void run() {
		try {
			for (int i = 10; i > 5; i--) {
				System.out.println("Executing :"
						+ Thread.currentThread().getName());
				Thread.sleep(5000);
			}

		} catch (InterruptedException e) {
		}

		System.out.println("Exiting: " + Thread.currentThread().getName()+ Thread.currentThread().isAlive());
	}
}
