package Thread21_01;

public class Demo2 {
	public static void main(String[] args) {
		Ohluv oncho = new Ohluv("Oncho");
		Ohluv boncho = new Ohluv("Boncho");
		
		new Thread(oncho).start();
		new Thread(boncho).start();
		System.out.println("Systezanieto svyrshi!");
	}
}
