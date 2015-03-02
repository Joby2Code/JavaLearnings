package demo.multithreading;

public class Counter implements Runnable {
	Thread T;
	int counter = 0;
	volatile boolean goFlag;

	Counter(int p) {
		T = new Thread(this);
		T.setPriority(p);
	}

	public void start() {
		goFlag = true;
		T.start();

	}

	public void run() {
		// TODO Auto-generated method stub
		while (goFlag)
			counter++;

	}

	public void end() {
		goFlag = false;
	}
}
