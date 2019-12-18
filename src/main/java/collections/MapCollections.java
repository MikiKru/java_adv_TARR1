package collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollections {
    Map<String, Integer> romanToDecimal = new HashMap<>();

    public void addElementsToMap(){
        romanToDecimal.put("I", 1);
        romanToDecimal.put("II", 2);
        romanToDecimal.put("III", 3);
        romanToDecimal.put("IV", 4);
        romanToDecimal.put("V", 5);
    }
    public void getElementsFromMap(){
        for (String key : romanToDecimal.keySet()) {
            if(romanToDecimal.get(key) % 2 == 0) {
                System.out.println("K: " + key + " V: " + romanToDecimal.get(key));
            }
        }
    }
    public String getFirstKeyByValue(Integer value){
        for (String key : romanToDecimal.keySet()) {
            if(value.equals(romanToDecimal.get(key))){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        MapCollections mc = new MapCollections();
        mc.addElementsToMap();
        System.out.println(mc.romanToDecimal);
        mc.getElementsFromMap();
        // usuwanie pary k-v po kluczu
        mc.romanToDecimal.remove("I");
        // usuwanie pary k-v po wartości
        mc.romanToDecimal.remove(mc.getFirstKeyByValue(5));    // jak dostać sie po wartości do klucza ???
        System.out.println(mc.romanToDecimal);


    }
}
