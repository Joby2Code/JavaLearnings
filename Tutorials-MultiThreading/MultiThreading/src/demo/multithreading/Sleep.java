package demo.multithreading;

public class Sleep {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewThread ob1 = new NewThread("Thread 1");
		NewThread ob2 = new NewThread("Thread 2");

		try {
			Thread.sleep(1500);
			ob1.T.suspend();
			System.out.println("Thread 1 is sleeping");
			Thread.sleep(1500);
			ob1.T.resume();
			System.out.println("Thread 1 is resuming");
		} catch (InterruptedException e) {
			System.out.println("Main thread broken");
		}

	}

}
