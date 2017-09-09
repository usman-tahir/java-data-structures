
public class MultiplicationTable {
    
    public static void multTable(int n) {
        // pre: n >= 0
        // post: print the multiplication table of width n
        int row, col;

        for (row = 1; row <= n; row += 1) {
            for (col = 1; col <= n; col += 1) {
                System.out.print(row * col + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        multTable(10);
    }
}