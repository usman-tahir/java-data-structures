
public interface Card {
	public static final int ACE = 1;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	public static final int JOKER = 14;
	public static final int CLUBS = 0;
	public static final int DIAMONDS = 1;
	public static final int HEARTS = 2;
	public static final int SPADES = 3;

	public int suit();
	// post: returns the suit of the card
	
	public int face();
	// post: returns the face of the card
	
	public boolean isWild();
	// post: returns true iff this card is a wild card
	
	public int value();
	// post: return the point value of the card

	public int compareTo(Object other);
	// pre: other is a valid Card
	// post: returns int <, ==, > 0 if this card is <, ==, > other

	public String toString();
	// post: returns a printable version of this card
}