package homeworkWithMaps;

import java.util.HashMap;
import java.util.Map;

public class MapsExercise {
    public static void main(String[] args) {
//Creeaza doua HashMap-uri diferite:
        HashMap<String, String> numeOras = new HashMap<>();
        HashMap<String, Integer> produsPret = produsMapPopulate();
//-----------------------------------------------------------------------------------------------------
        putValuesInMap("Vlad", "Bacau", numeOras);
        putValuesInMap("NextVlad", "Iasi", numeOras);
//-----------------------------------------------------------------------------------------------------
        getValueFromMap("Vlad", numeOras);
//-----------------------------------------------------------------------------------------------------
        doesKeyExist("Dorel", numeOras);
//-----------------------------------------------------------------------------------------------------
        removeMapEntry("Vlad", numeOras);
//-----------------------------------------------------------------------------------------------------
        updateValue("NextVlad", "Marte", numeOras);
//-----------------------------------------------------------------------------------------------------
        addIfNotExist("Vlad", "Bacau", numeOras);
        addIfNotExist("Musk", "USA", numeOras);
        addIfNotExist("Elon", "Nevada", numeOras);
        addIfNotExist("Jeff", "Amazon", numeOras);
//-----------------------------------------------------------------------------------------------------
        iterateEntrySet(numeOras);
//-----------------------------------------------------------------------------------------------------
        lambdaIteration(numeOras);
//-----------------------------------------------------------------------------------------------------
        lambdaIteration(produsPret);
//-----------------------------------------------------------------------------------------------------
        iterateEntrySet(produsPret);
//-----------------------------------------------------------------------------------------------------
    }

    public static void putValuesInMap(String key, String value, HashMap<String, String> theMap) {
        theMap.put(key, value);
    }

    public static void getValueFromMap(String key, HashMap<String, String> theMap) {
        System.out.println("Pentru cheia: " + key + " avem valoarea: " + theMap.get(key));
    }

    public static void doesKeyExist(String key, HashMap<String, String> theMap) {
        System.out.println("Avem in: " + theMap + " urmatoarea cheie: " + key + " -> " + theMap.containsKey(key));
    }

    public static void removeMapEntry(String key, HashMap<String, String> theMap) {
        theMap.remove(key);
        System.out.println("Cheia " + key + " a fost stearsa.Noua mapa contine: ");
        lambdaIteration(theMap);
    }

    public static void updateValue(String key, String value, HashMap<String, String> theMap) {
        theMap.replace(key, value);
        System.out.println("Dupa update mapa arata asa:");
        iterateEntrySet(theMap);
    }

    public static void addIfNotExist(String key, String value, HashMap<String, String> theMap) {
        theMap.putIfAbsent(key, value);
        System.out.println("Dupa tentadiva de update mapa arata asa:" + theMap);
    }

    /**
    public static void iterateEntrySet(HashMap<String, String> theMap) {
        for (Map.Entry<String, String> entry : theMap.entrySet()) {
            System.out.println("Iterare cu entry in entrySet: " + entry);
        }
    }
     **/
    public static <K, V> void iterateEntrySet(Map<K,V> theMap){
        for (Map.Entry<K,V> entry : theMap.entrySet()) {
            System.out.println("Iterare cu entry in entrySet: " + entry);
        }
    }

    public static <K, V> void lambdaIteration(Map<K, V> theMap) {
        theMap.forEach((key, value) -> System.out.println("Cheia: " + key + ", Valoarea: " + value));
    }
    // chatGPT fix for not having my method that looked like this :
    //    public static void lambdaIteration(HashMap<String, String> theMap) {
    //        theMap.forEach((key, value) -> System.out.println("Cheia este: " + key + ", Iar valoarea: " + value));
    //    }
    //    Overloading not worked as expected

    public static HashMap<String, Integer> produsMapPopulate() {
        HashMap<String, Integer> produsMap = new HashMap<>();
        produsMap.put("Laptop", 5000);
        produsMap.put("Dacia Spring", 50000);

        return produsMap;
    }

}
