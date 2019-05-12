package MyMap;

import java.util.ArrayList;

public class MapImplementation<K,V> implements MyMap<K,V>{
    private ArrayList<Pair<K,V>> map;
    private Pair<K,V> mapElement;
    
    MapImplementation(){
        this.map = new ArrayList<>();
    }
    
    @Override
    public void put(K key, V value) {
       mapElement = new Pair(key,value);
       map.add(mapElement);
    }

    @Override
    public Object get(K key) {
        for(Pair element: this.map){
            if(element.getKey().equals(key)){
                return element.getValue();
            }
        }
        return null;
    }

    @Override
    public void remove(K key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
