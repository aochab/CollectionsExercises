package MyMap;

public class Main {

    public static void main(String[] args) {
       MapImplementation<String,Integer> mapa = new MapImplementation<>();
       mapa.put("Kuba", 1);
       
       System.out.println(mapa.get("Kuba"));
    }
    
}
