
abstract public class AbstractGenerator implements Generator {
	protected int current;

	public AbstractGenerator(int initial) {
		// post: initialize the current value to initial
		this.current = initial;
	}

	public AbstractGenerator() {
		// post: initialize the current value to zero
		this(0);
	}

	protected int set(Integer next) {
		// post: sets the current value to next, and extends the sequence
		int result = this.current;
		this.current = next;
		return result;
	}

	public int get() {
		// post: returns the current value of the sequence
		return this.current;
	}


	public void reset() {
		// post: resets the Generator (by default, does nothing)
	}
}