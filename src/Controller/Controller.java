package Controller;

public class Controller {
	
	public void concatenaString() {
		String cadeia = "";
		double Tinicial = System.nanoTime();
		for(int i = 0; i <1000; i++) {
			cadeia = cadeia + "A";
		}
		double Tfinal = System.nanoTime();
		double Ttotal = Tfinal - Tinicial;
		
		System.out.println("String ==> "+ Ttotal + "s.");
	}
	
	public void concatenabuffer() {
		StringBuffer buffer = new StringBuffer();
		double Tinicial = System.nanoTime();
		for(int i = 0; i <1000; i++) {
			buffer.append("a");
		}
		double Tfinal = System.nanoTime();
		double Ttotal = Tfinal - Tinicial;
		
		System.out.println("Buffer ==> "+ Ttotal + "s.");
			
		     
	}

}
