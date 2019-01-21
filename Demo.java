package Thread21_01;

public class Demo {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
//		Thread.currentThread().setPriority(1);
		thread.start(); // starts a new thread
		
		Thread thread2 = new Thread(new MyThread2());
		int a= 1+2;
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Eto paralelen kod v anonimen klas!");
			}
		}).start();
		
		new Thread(() -> System.out.println("Eto go i s lambda, dobre che gi nauchih!")).start();
		thread2.start();
		
		System.out.println("Tova e v main nishkata");
	}
}
