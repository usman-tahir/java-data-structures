
public class Vector {
    protected Object elementData[];
    protected int elementCount;
    protected int capacityIncrement;

    public Vector() {
        // post: constructs an empty vector with a capacity for 10 elements
        this(10, 1);
    }

    public Vector(int initialCapacity, int capacityIncrement) {
        // pre: initialCapacity >= 0
        // post: constructs an empty vector with initialCapacity capacity
        this.elementData = new Object[initialCapacity];
        this.elementCount = 0;
        this.capacityIncrement = capacityIncrement;
    }

    public Object get(int index) {
        // pre: 0 <= index && index < size()
        // post: returns the element stored in location index
        return this.elementData[index];
    }

    public Object set(int index, Object object) {
        // pre: 0 <= index && index < size()
        // post: element value is changed to object; old value is returned
        Object previous = this.elementData[index];
        this.elementData[index] = object;
        return previous;
    }

    public void add(Object object) {
        // post: adds a new element to the end of the possibly extended vector
        ensureCapacity(this.elementCount + 1);
        this.elementData[this.elementCount] = object;
        this.elementCount += 1;
    }

    public void add(int index, Object object) {
        // pre: 0 <= index <= size()
        // post: inserts a new value into the vector, at the desired index
        int i;
        ensureCapacity(this.elementCount + 1);

        // you must copy from right to left, to avoid destroying data
        for (i = this.elementCount; i > index; i -= 1) {
            this.elementData[i] = this.elementData[i - 1];
        }
        this.elementData[index] = object;
        this.elementCount += 1;
    }

    public Object remove(int index) {
        // pre: 0 < index && index < size()
        // post: indicated element is removed; size decreases by 1
        Object result = this.get(index);
        this.elementCount -= 1;

        while (index < this.elementCount) {
            this.elementData[index] = this.elementData[index + 1];
            index += 1;
        }
        this.elementData[this.elementCount] = null; // free the reference
        return result;
    }

    public boolean isEmpty() {
        // post: returns true iff there are no elements in the vector
        return this.size() == 0;
    }

    public int size() {
        // post: returns the size of the vector
        return this.elementCount;
    }

    public void ensureCapacity(int minCapacity) {
        // post: the capacity of the vector is at least minCapacity
        if (this.elementData.length < minCapacity) {
            int newLength = this.elementData.length;
            if (this.capacityIncrement == 0) {
                // increment of 0 indicated doubling
                if (newLength == 0) {
                    newLength = 1;
                }

                while (newLength < minCapacity) {
                    newLength *= 2;
                }
            } else {
                // increment != 0 suggests incremental increase
                while (newLength < minCapacity) {
                    newLength += capacityIncrement;
                }
            }

            Object newElementData[] = new Object[newLength];
            int i;

            // copy the old data to the new array
            for (i = 0; i < this.elementCount; i += 1) {
                newElementData[i] = this.elementData[i];
            }
            this.elementData = newElementData;
        }
    }
}