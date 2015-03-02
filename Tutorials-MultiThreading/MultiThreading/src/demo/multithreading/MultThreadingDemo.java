package demo.multithreading;

public class MultThreadingDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread obj1 = new CustomThread("First");
		Thread.sleep(15000);
		Thread obj2 = new CustomThread("Second");
		Thread obj3 = new CustomThread("Third");
		Thread obj4 = new CustomThread("Fourth");
		// Thread obj1=new CustomThread("First");*/
		Thread.currentThread().setName("Main Thread");
		System.out.println("The thread alive is"+obj1.getName()+obj1.isAlive());
		/*
		 * try { for (int i = 20; i > 4; i--) { System.out.println("Executing "
		 * + Thread.currentThread().getName()); Thread.sleep(1000); }
		 */
		try {
			obj1.join();
			Thread.sleep(5000);
			
			 //obj2.join(); obj3.join(); obj4.join();
			 

		} catch (InterruptedException e) {
		}
		System.out.println("Exiting " + Thread.currentThread().getName());
		System.out.println("The thread alive is"+obj1.getName()+obj1.isAlive());

	}

}
