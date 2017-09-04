import java.util.Map;

public class Association implements Map.Entry {
    protected Object key;
    protected Object value;

    public Association(Object key, Object value) {
        // pre: key is non-null
        // post: constructs a key-value pair
        this.key = key;
        this.value = value;
    }

    public Association(Object key) {
        // pre: key is non-null
        // post: constructs a key-value pair
        this(key, null);
    }

    public Object getKey() {
        return this.key;
    }

    public Object getValue() {
        return this.value;
    }

    public Object setValue(Object value) {
        // post: sets the association's value to value
        Object oldValue = this.value;
        this.value = value;
        return oldValue;
    }
}