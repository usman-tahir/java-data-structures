
public class PrimeGenerator extends AbstractGenerator {
	public PrimeGenerator() {
		// post: construct a generator that delivers primes, starting at 2
		this.reset();
	}

	public void reset() {
		// post: reset the generator to return primes starting at 2
		this.set(2);
	}

	public int next() {
		// post: generate the next prime
		int f, n = get();

		do {
			if (n == 2) {
				n = 3;
			} else {
				n += 2;
			}

			// check the next value
			for (f = 2; f * f <= n; f += 1) {
				if (0 == (n % f)) {
					break;
				}
			}
		} while (f * f <= n);
		this.set(n);
		return n;
	}
}