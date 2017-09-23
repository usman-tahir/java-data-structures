
public class SinglyLinkedList {
	protected int count;
	protect Node<E> head;

	public SinglyLinkedList() {
		this.head = null;
		this.count = 0;
	}

	public int size() {
		return this.count;
	}

	public void addFirst(E value) {
		this.head = new Node<E>(value, this.head);
		this.count++;
	}

	public E removeFirst() {
		Node<E> temp = this.head;
		this.head = this.head.getNext();
		this.count--;
		return temp.getValue();
	}

	public E getFirst() {
		return this.head.getValue();
	}

	public void addLast(E value) {
		Node<E> temp = new Node<E>(value, null);
		if (this.head != null) {
			Node<E> cursor = this.head;
			while (cursor.getNext() != null) {
				cursor = cursor.getNext();
			}
			cursor.setNext(temp);
		} else {
			this.head = temp;
		}
		this.count++;
	}

	public E removeLast() {
		Node<E> cursor = this.head;
		Node<E> previous = null;

		while (cursor.getNext() != null) {
			previous = cursor;
			cursor = cursor.next();
		}

		if (previous == null) {
			// Exactly one element
			this.head = null;
		} else {
			// pointer to the last element is reset
			previous.setNext(null);
		}
		this.count--;
		return cursor.getValue();
	}

	public boolean contains(E value) {
		Node<E> cursor = this.head;
		while (cursor != null && !cursor.getValue().equals(value)) {
			cursor = cursor.getNext();
		}
		return cursor != null;
	}

	public E remove(E value) {
		Node<E> cursor = this.head;
		Node<E> previous = null;

		while (cursor != null && !cursor.getValue().equals(value)) {
			previous = cursor;
			cursor = cursor.getNext();
		}

		// cursor points to the target value
		if (cursor != null) {
			if (previous == null) { // first node encountered
				this.head = cursor.getNext();
			} else {
				previous.setNext(cursor.getNext());
			}
			this.count--;
			return cursor.getValue();
		}
		return null;
	}

	public void clear() {
		this.head = null;
		this.count = 0;
	}

	public void add(int index, E value) {
		if (index == this.size()) {
			this.addLast(value);
		} else if (index == 0) {
			this.addFirst(value);
		} else {
			Node<E> previous = null;
			Node<E> cursor = this.head;

			while (index > 0) {
				previous = cursor;
				cursor - cursor.getNext();
				index--;
			}

			// Create the new value to insert it in the correct position
			Node<E> current = new Node<E>(value, cursor);
			this.count++;

			// Make the previous value point to the new value
			previous.setNext(cursor);
		}
	}

	public E remove(int index) {
		if (index == 0) {
			return this.removeFirst();
		} else if (index == this.size() - 1) {
			return this.removeLast();
		} else {
			Node<E> previous = null;
			Node<E> cursor= this.head;

			while (index > 0) {
				previous = cursor;
				cursor = cursor.getNext();
				index--;
			}

			// In the SinglyLinkedList, somewhere in the middle
			previous.setNext(cursor.getNext());
			this.count--;

			// Return the old value
			return cursor.getValue();
		}
	}
}