
public class PokerCardMain {
	public static void main(String[] args) {
		// Generate 10 random cards and print them out
		int i;

		for (i = 0; i < 10; i += 1) {
			PokerCard p = new PokerCard();
			System.out.println(p.toString());
		}
	}
}