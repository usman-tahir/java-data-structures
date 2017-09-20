import java.util.Random;

public abstract class AbstractCard implements Card {
	protected int cardIndex;
	protected static Random generator = new Random();

	public AbstractCard() {
		// post: constructs a random card in a standard deck
		set(randomIndex(52));
	}

	protected static int randomIndex(int max) {
		// pre: max > 0
		// post: returns a random number n, 0 <= n < max
		return Math.abs(generator.nextInt()) % max;
	}

	protected void set(int index) {
		// post: this card has cardIndex index
		this.cardIndex = index;
	}

	protected int get() {
		// post: returns this card's cardIndex
		return this.cardIndex;
	}

	public int suit() {
		// post: returns the suit of the card
		return this.cardIndex / 13;
	}

	public int face() {
		// post: returns the face of the card
		return (this.cardIndex % 13) + 1;
	}

	public boolean isWild() {
		// post: returns true iff this card is a wild card (default is false)
		return false;
	}

	public int value() {
		// post: return the point value of the card
		return this.face();
	}

	public String toString() {
		// post: returns a printable version of the card
		String cardName = "";

		switch(this.face()) {
			case ACE:
				cardName = "Ace";
				break;
			case JACK:
				cardName = "Jack";
				break;
			case QUEEN:
				cardName = "Queen";
				break;
			case KING:
				cardName = "King";
				break;
			default:
				cardName = cardName + this.face();
				break;
		}

		switch(this.suit()) {
			case HEARTS:
				cardName += " of Hearts";
				break;
			case DIAMONDS:
				cardName += " of Diamonds";
				break;
			case CLUBS:
				cardName += " of Clubs";
				break;
			case SPADES:
				cardName += " of Spades";
				break;
		}
		return cardName;
	}
}