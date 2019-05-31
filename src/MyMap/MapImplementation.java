package MyMap;

import java.util.ArrayList;
import java.util.Iterator;

public class MapImplementation<K,V> implements MyMap<K,V>{
    private ArrayList<Pair<K,V>> map;
    private Pair<K,V> mapElement;
    
    MapImplementation(){
        map = new ArrayList<>();
    }
    
    @Override
    public void put(K key, V value) {
       mapElement = new Pair(key,value);
       map.add(mapElement);
    }

    @Override
    public ArrayList<Pair<K,V>> get(K key) {
        ArrayList<Pair<K,V>> matchingKeyElements = new ArrayList<>();
        for(Pair element: map){
            if(element.getKey().equals(key)){
                matchingKeyElements.add(element);
            }
        }
        if(!matchingKeyElements.isEmpgit coty()){
            return matchingKeyElements;
        }else{
            return null;
        }
    }

    @Override
    public void remove(K key) {
        Iterator<Pair<K, V>> iterator = map.iterator();
        while(iterator.hasNext()){
            Pair<K,V> element = iterator.next();
            
            if(element.getKey().equals(key)){
               iterator.remove();
            }
        }
    }

    @Override
    public boolean isEmpty() {
       return map.isEmpty();
    }

    @Override
    public int size() {
       return map.size();
    }

    
}
