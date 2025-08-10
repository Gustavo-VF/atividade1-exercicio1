package Controller;

public class Controller {
	
	public void concatenaString() {
		 int[] vetor = new int[1000];
		double Tinicial = System.nanoTime();
		for(int i = 0; i <1000; i++) {
			vetor[i] = 0;
		}
		double Tfinal = System.nanoTime();
		double Ttotal = Tfinal - Tinicial;
		Ttotal = Ttotal / Math.pow(10, 9);
		System.out.println("Tempo ==> "+ Ttotal + "s.");
	}
}