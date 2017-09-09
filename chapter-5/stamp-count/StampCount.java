
public class StampCount {
    
    public final static int LETTER = 41;
    public final static int CARD = 26;
    public final static int PENNY = 1;

    public static int stampCount(int amount) {
        // pre: amount >= 0
        // post: return the number of stamps needed to make change
        // (only use letter, card and penny stamps)
        return stampCount(amount, new int[amount + 1]);
    }

    protected static int stampCount(int amount, int[] answer) {
        // pre: amount >= 0; answer array has length >= amount
        // post: return the number of stamps needed to make change
        // (only use letter, card and penny stamps)
        int minStamps;

        if (amount == 0) {
            return 0;
        }

        if (answer[amount] != 0) {
            return answer[amount];
        }

        // Consider usage of a penny stamp
        minStamps = 1 + stampCount(amount - 1, answer);

        // Consider usage of a post card stamp
        if (amount >= CARD) {
            int possible = 1 + stampCount(amount - CARD, answer);
            if (minStamps > possible) {
                minStamps = possible;
            }
        }

        // Consider usage of a letter stamp
        if (amount >= LETTER) {
            int possible = 1 + stampCount(amount - LETTER, answer);
            if (minStamps > possible) {
                minStamps = possible;
            }
        }

        answer[amount] = minStamps;
        return minStamps;
    }
    
    public static void main(String[] args) {
        System.out.println(stampCount(100));
    }
}