
public class DifferenceTable {
    
    public static void diffTable(int n) {
        // pre: n >= 0
        // post: print the difference table of width n
        int row, col;

        for (row = 1; row <= n; row += 1) {
            for (col = 1; col <= n; col += 1) {
                System.out.print(row - col + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diffTable(10);
    }
}