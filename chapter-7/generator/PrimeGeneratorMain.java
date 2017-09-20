
public class PrimeGeneratorMain {
	public static void main(String[] args) {
		PrimeGenerator p = new PrimeGenerator();
		System.out.println(p.get()); // returns 2, for the first main

		// Generate the next 10 primes and print them out
		int i;

		for (i = 0; i < 10; i += 1) {
			p.next();
			System.out.println(p.get());
		}
	}
}