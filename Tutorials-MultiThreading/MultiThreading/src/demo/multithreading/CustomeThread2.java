package demo.multithreading;

public class CustomeThread2 extends Thread {
	Shared shared;
	private String name;

	CustomeThread2(Shared shared2, String name) {
		super(name);
		this.shared = shared2;
		start();
	}

	public void run() {
		// synchronized (shared) {
		try {
			shared.print(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
// }
