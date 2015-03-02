package demo.multithreading;

public class Shared {

	synchronized void print(String name) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Entering thread" + name);
		Thread.sleep((long) (Math.random() * 5000));
		System.out.println("Exiting thread" + name);
	}

}
