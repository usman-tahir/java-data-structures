import java.util.Scanner;

public class LSystem {
    final static Character L = new Character('L');
    final static Character S = new Character('S');

    public static Vector rewrite(Vector s) {
        // pre: s is a string of L and S values
        // post: returns a string rewritten by productions
        Vector result = new Vector();
        int position;

        for (position = 0; position < s.size(); position += 1) {
            // rewrite based on the rules
            if (S == s.get(position)) {
                result.add(L);
            } else if (L == s.get(position)) {
                result.add(S);
                result.add(L);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Vector string = new Vector();
        string.add(S);

        // determine the number of strings
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        int i;

        System.out.println(string);
        for (i = 0; i <= count; i += 1) {
            string = rewrite(string);
            System.out.println(string);
        }
    }
}