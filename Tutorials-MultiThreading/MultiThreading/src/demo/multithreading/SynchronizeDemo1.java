package demo.multithreading;

public class SynchronizeDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shared shared = new Shared();
		Thread obj1 = new CustomeThread2(shared, "First");
		Thread obj2 = new CustomeThread2(shared, "Second");
		Thread obj3 = new CustomeThread2(shared, "Third");
		Thread obj4 = new CustomeThread2(shared, "Fourth");
		try {
			obj1.join();
			obj2.join();
			obj3.join();
			obj4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Exiting" + Thread.currentThread().getName());
	}

}
