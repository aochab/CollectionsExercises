package MyMap;

public interface MyMap<K,V> {
    void put(K key, V value);
    Object get(K key);
    void remove(K key);
    boolean isEmpty();
    int size();
}
