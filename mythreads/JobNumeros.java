package mythreads;

public class JobNumeros implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
