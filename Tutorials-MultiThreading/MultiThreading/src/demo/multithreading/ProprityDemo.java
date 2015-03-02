package demo.multithreading;

public class ProprityDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Counter obj1 = new Counter(Thread.NORM_PRIORITY + 2);
		Counter obj2 = new Counter(Thread.NORM_PRIORITY - 3);
		Counter obj3 = new Counter(Thread.NORM_PRIORITY + 2);
		Counter obj4 = new Counter(Thread.NORM_PRIORITY - 3);
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
		Thread.sleep(10000);
		obj1.end();
		obj2.end();
		obj3.end();
		obj4.end();

		System.out.println("Thread 1 counted" + obj1.counter);

		System.out.println("Thread 2 counted" + obj2.counter);
		System.out.println("Thread 3 counted" + obj3.counter);
	}

}
