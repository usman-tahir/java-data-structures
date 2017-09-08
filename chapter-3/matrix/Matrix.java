
public class Matrix {
    protected Vector rows;
    protected int height, width;

    public Matrix(int height, int width) {
        // pre: h >= 0, w >= 0
        // post: constructs an h row by w column matrix
        this.height = height;
        this.width = width;

        // allocate a Vector of rows
        this.rows = new Vector(height);
        int r;

        for (r = 0; r < this.height; r += 1) {
            int c;

            Vector row = new Vector(width);
            this.rows.add(row);

            for (c = 0; c < this.width; c += 1) {
                row.add(null);
            }
        }
    }

    public Object get(int row, int column) {
        // pre: 0 <= row < height(), 0 <= col < width()
        // post: returns object at (row, column)

        Vector matrixRow = (Vector)this.rows.get(row);
        return matrixRow.get(column);
    }

    public void set(int row, int column, Object value) {
        // pre: 0 <= row < height(), 0 <= col < width()
        // post: changes location (row, column) to value
        Vector matrixRow = (Vector)this.rows.get(row);
        matrixRow.set(column, value);
    }

    public void addRow(int row) {
        // pre: 0 <= row < height()
        // post: inserts a row of null values to be row row
        this.height += 1;
        Vector matrixRow = new Vector(this.width);
        int c;

        for (c = 0; c < width; c += 1) {
            matrixRow.add(null);
        }
        this.rows.add(row, matrixRow);
    }
}