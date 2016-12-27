package ejercicios_POO;

public class PruebaReloj {
	public static void main (String [] args) throws InterruptedException{
		Reloj miReloj = new Reloj(23,59,55);
		miReloj.run();
	}
}
