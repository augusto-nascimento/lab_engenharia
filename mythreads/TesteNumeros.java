package mythreads;

public class TesteNumeros {
	public static void main(String[] args) {
		JobNumeros j1 = new JobNumeros();
		JobNumeros j2 = new JobNumeros();
		Thread t1 = new Thread( j1 );
		Thread t2 = new Thread( j2 );
		t1.start();
		t2.start();
	}
}
