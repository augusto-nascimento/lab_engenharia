package mythreads;

public class TesteFatorial {
	public static void main(String[] args) {
		Fatorial j1 = new Fatorial(100);
		Thread t1 = new Thread( j1 );
		t1.start();
	}
}
