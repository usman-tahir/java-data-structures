
public class Node<E> {
	protected E data;
	protected Node<E> next;

	public Node(E data, Node<E> next) {
		// pre: data is a value, next is a reference to the remainder of the list
		// post: an element is constructed as the new head of the list
		this.data = data;
		this.next = next;
	}

	public Node(E data) {
		// post: constructs a new tail of a list, with value data
		this(data, null);
	}

	public E getData() {
		// post: returns the value associated with this element
		return this.data;
	}

	public void setData(E data) {
		// post: sets the value associated with this element
		this.data = data;
	}

	public Node<E> getNext() {
		// post: returns a reference to the next value in the list
		return this.next;
	}

	public void setNext(Node<E> next) {
		// post: sets a reference to the new next value
		this.next = next;
	}

	public boolean hasNext() {
		return this.getNext() != null;
	}

	public String toString() {
		String hasNextNode = (this.hasNext() ? "Yes\n" : "No\n");
		return "Data: " + this.getData() + "\nHas next: " + hasNextNode;
	}
}