package MyMap;

public class Main {

    public static void main(String[] args) {
       MapImplementation<String,Integer> mapa = new MapImplementation<>();
       mapa.put("One", 1);
       mapa.put("One", 12);
       mapa.put("Two",2);
       mapa.remove("Two");
       
       for(Pair<String,Integer> element: mapa.get("One")){
           System.out.println(element.getValue());
       }
       System.out.println(mapa.get("Two"));
       
       /*
       mapa.remove("Two");
       if(mapa.isEmpty()){
           System.out.println("Map is empty");
       }
       */
    }
    
}
