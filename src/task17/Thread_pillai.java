package task17;

public class Thread_pillai extends Thread {
	int a;
	int b;
	static long sum;

	public Thread_pillai(int a, int b) {
		this.a = a;
		this.b = b;
		this.sum = 0;
	}

	public void run() {
		for(int i=a;i<=b;i++) {
			sum = sum + i;
			System.out.println(i);
		}
		
	}

	public static long getsum() {
		return sum;
	}

	public static void main(String[] args) throws InterruptedException {
		Thread_pillai a = new Thread_pillai(1, 50);
		Thread_pillai b = new Thread_pillai(51, 99);
		
		a.start();
		b.start();
//		synchronized (a) {
//			
//			a.wait(100);
//			a.notify();
//		}
		synchronized (currentThread()) {

			currentThread().wait(10);
			currentThread().notify();
			
		}

		System.out.println(getsum());

//		Thread.sleep(100);

	}

}
