
public class FindSpace {
    
    static int findSpace(String s) {
        // pre: s is a string, possibly containing a space
        // post: returns the index of the first space, or -1 if no spaces are found
        int i;
        int l = s.length();
        for (i = 0; i < l; i += 1) {
            if (' ' == s.charAt(i)) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        String s = "Hello world";
        System.out.println("String: " + s + "\nSpace at index: " + findSpace(s) + "\n");
    }
}