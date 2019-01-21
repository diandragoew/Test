package Thread21_01;

public class Ohluv implements Runnable {
	
	private String name;

	Ohluv(String name) {
		this.name = name;
	}
	
	
	@Override
	public void run() {
		for (int m = 1; m <= 100; m++ ) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Ohluva " + this.name.toUpperCase() + " e na tozi metyr " + m);
		}
	}
	

}
