import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMain {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();

		// Add values to a
		String[] letters = {"A", "B", "C", "D", "E", "F"};
		for (String letter : letters) {
			a.add(letter);
		}

		System.out.println("Original contents of a:");
		Iterator i = a.iterator();

		while(i.hasNext()) {
			Object element = i.next();
			System.out.println(element + " ");
		}
		// System.out.println();
	}
}