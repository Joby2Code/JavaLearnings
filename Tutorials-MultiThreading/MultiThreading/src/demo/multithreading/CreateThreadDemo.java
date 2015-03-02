package demo.multithreading;

public class CreateThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread.currentThread().setName("Main Thread");
		NewThread obj = new NewThread();
		CountDownClock obj2 = new CountDownClock();
		obj2.setPriority(1);

		obj2.setName("Concurrent thread 2");
		obj2.start();

		try {
			for (int i = 10; i > 6; i--) {
				System.out.println("Parent Child" + i);
				if (i == 8) {
					// Thread.dumpStack();
					System.out.println(Thread.currentThread().getName());

				}
				Thread.sleep(2000);
			}

		}

		catch (InterruptedException e) {
			System.out.println("parent interrupted");
		}

		System.out.println("Exiting parent");
	}
}
