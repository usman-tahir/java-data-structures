import java.util.*;

public class ListMain {
	public static void main(String[] args) {
		// Read input
		Scanner s = new Scanner(System.in);
		String current;

		// List of unique lines
		List<String> lines = new LinkedList<String>();

		while(s.hasNextLine()) {
			current = s.nextLine();

			// Quit when a blank line is encountered
			if (current.equals("")) {
				break;
			}

			// Check if the line needs to be added
			if (!lines.contains(current)) {
				System.out.println("Added to lines: '" + current + "'");
				lines.add(current);
			} else {
				System.out.println("'" + current + "'" + " already exists in lines.");
			}
		}
	}
}