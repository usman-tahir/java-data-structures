
public class Association<K, V> {
    protected K key;
    protected V value;

    public Association(K key, V value) {
        // pre: key is non-null
        // post: constructs a key-value pair
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        // post: returns the key from the association
        return this.key;    
    }

    public V getValue() {
        // post: returns the value from the association
        return this.value;
    }

    public K setKey(K key) {
        K oldKey = this.key;
        this.key = key;
        return oldKey;
    }

    public V setValue(V value) {
        V oldValue = this.value;
        this.value = value;
        return oldValue;
    }

    public String toString() {
        return "Key: " + this.getKey() + " Value: " + this.getValue() + "\n";
    }
}