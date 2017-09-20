
public class PokerCard extends AbstractCard {
	public PokerCard(int face, int suit) {
		this.set(suit * 13 + face - 1);
	}

	public PokerCard() {
		// post: construct a random poker card
		// by default, calls the AbstractCard constructor
	}

	public int value() {
		if (this.face() == ACE) {
			return KING + 1;
		} else {
			return this.face();
		}
	}

	public int compareTo(Object other) {
		// pre: other is a valid PokerCard
		// post: returns the relationship between this card and other
		PokerCard that = (PokerCard)other;
		return this.value() - that.value();
	}
}