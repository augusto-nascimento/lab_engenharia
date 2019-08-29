package mythreads;

import java.math.BigInteger;

public class Fatorial implements Runnable{
	private long f;
	public Fatorial(int f) { 
		this.f = f;
	}
	@Override
	public void run() {
		BigInteger r = BigInteger.ONE;
		BigInteger i = BigInteger.ONE;
		while (i.min(new BigInteger("100"))) {
			
			
		}
		for (long i = 1; i <= f; i++) {
			r = r * i;
			System.out.println(r);
		}
		System.out.println(r);
	}
	
}
