package MyMap;

import java.util.ArrayList;

public interface MyMap<K,V> {
    void put(K key, V value);
    ArrayList<Pair<K,V>> get(K key);
    void remove(K key);
    boolean isEmpty();
    int size();
}
