package May7;

class KeyValue<K, V>{
    private K key;
    private V value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}


public class TwoGeneric {
    public static void main(String[] args) {
        KeyValue<String, Integer> c = new KeyValue<>();
        c.setKey("파인애플");
        c.setValue(2000);
        String key1 = c.getKey();
        int value1 = c.getValue();
        System.out.println("key : " + key1 + " value : " + value1);

        KeyValue<Integer, String> d = new KeyValue<>();
        d.setKey(100);
        d.setValue("애플");
        Integer key2 = d.getKey();
        String value2 = d.getValue();
        System.out.println("key : " + key2 + " value : " + value2);
    }
}
