package lambdaStream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.lang.Math.sqrt;

public class LambdaStream {
    int numbers [] = {5,-4,6,-3,2,13,2, -1};
    List<Integer> numbersList  = new ArrayList<>(Arrays.asList(5,-4,6,-3,2,13,2, -1));
    List<String> names = new ArrayList<>(Arrays.asList("X","Y","Z"));
    public void getAllValuesArray(){
        // CTRL + Space
        Arrays.stream(numbers).forEach(n -> {
            if(n % 2 == 0) {
                System.out.print(n + " ");
            }
        });
    }
    public void getAllValuesList(){
        names.forEach(n -> System.out.printf("%s ",n));
    }
    public List<Integer> getPositiveValuesFromArray(){
        return numbersList.stream()                     // zamiana tablicy na strumień
                    .filter(value -> value > 0)         // operacja pośrednia filtrowanie wartości większych od zera
                    .collect(Collectors.toList());      // operacja kończąca zapis elementów do listy
    }
    public List<Integer> getElementsSorted(boolean asc){
        return numbersList.stream()                                         // zamiana listy na strumień
                    .sorted((value1, value2) -> {
                            if(asc){
                                return value1.compareTo(value2);  // operacja pośrednia sortowanie asc
                            } else {
                                return value2.compareTo(value1);   // operacja pośrednia sortowanie desc
                            }
                    })
                    .collect(Collectors.toList());                          // operacja kończąca zapis elementów do listy
    }
    public Integer getMaxFromList(){
        return numbersList.stream()
                            .sorted((v1, v2) -> v2.compareTo(v1))   // operacja pośrednia
                            .limit(1)                               // operacja pośrednia
                            .collect(Collectors.toList())           // operacja kończąca zwraca listę
                            .get(0);                                // getter zwracający wartość na indeksie 0
    }
    public Integer getMinFromList(){
        return numbersList.stream()
                .sorted((v1, v2) -> v1.compareTo(v2))   // operacja pośrednia
                .limit(1)                               // operacja pośrednia
                .collect(Collectors.toList())           // operacja kończąca zwraca listę
                .get(0);                                // getter zwracający wartość na indeksie 0
    }
    public Double getAvgFromList(){
        return numbersList.stream()
                .mapToDouble(Integer::doubleValue)   // przekształcenie wartości na double
                .average()                          // oblicza średnią z wszystkich wartości -> Optional<Double>
                .getAsDouble();                     // zwraca wartość typu double  -> pobranie getterm wartości z optionama
    }
    public Integer findValue(Integer value){
        for (Integer i : numbersList) {
            if(i.equals(value)){
                return value;
            }
        }
        return null;
    }
    public Optional<Integer> findValueWithOptional(Integer value){
        return numbersList.stream()                 // strumień
                .filter(v -> v.equals(value))      // zwraca optional zwraca kontener z wartością lub z nullem
                .findAny();
    }
    public Optional<Integer> getMinWithOptional(){
//        return numbersList.stream().min((o1, o2) -> o1.compareTo(o2));
        return numbersList.stream().min(Integer::compareTo);
    }
    public List<Integer> getPositiveAndEvenSortedValues(){
        return numbersList.stream()
                .filter(i -> (i % 2 == 0) && (i > 0))               // operacja pośrednia
                .sorted(Comparator.comparing(Integer::intValue))    // operacja pośrednia
                .collect(Collectors.toList());                      // operacja kończąca
    }
    // zwróć wynik pierwiatskowania kwadratowego dla każdego elementu listy numbesList
    public List<Double> getSqrtForAllValues(){
        return numbersList.stream()
                .filter(i -> i >= 0)
                .map(Math::sqrt)
                .collect(Collectors.toList());
    }
    public void printSqrtCollection(Collection c){
        c.stream().forEach(o -> System.out.printf("%.2f ",o));
    }

    public static void main(String[] args) {
        LambdaStream ls = new LambdaStream();
        ls.printSqrtCollection(ls.getSqrtForAllValues());
//        System.out.println(ls.getPositiveAndEvenSortedValues());
//        ls.getMinWithOptional().ifPresent(i -> System.out.println("Wartość minimalna to: " + i));
//        System.out.println(ls.getMinWithOptional().map(i -> String.valueOf(i)).orElse("Lista jest pusta"));
//        int findValue = -5;
////        if(ls.findValueWithOptional(findValue).isPresent()){       // jeżeli Optional przyjmuje wartośc niepustą -> true
////            System.out.println(ls.findValueWithOptional(findValue).get());
////        } else {                                            // optional zawiera null
////            System.out.println("Brak wartości "+findValue+" w naszej liście");
////        }
//        ls.findValueWithOptional(findValue)
//                .ifPresent(value -> System.out.println("Znaleziono " + value));
//        System.out.println(
//                ls.findValueWithOptional(findValue)
//                        .map(String::valueOf)
//                        .orElse("Brak wartości " + findValue)
//        );

//        System.out.println(ls.findValue(-5) + 2);
//        System.out.println(ls.getMaxFromList());
//        System.out.println(ls.getMinFromList());
//        System.out.println(ls.getAvgFromList());
        //        ls.getAllValuesArray();
//        System.out.println();
//        ls.getAllValuesList();
//        System.out.println();
//        List<Integer> filteredElements = ls.getPositiveValuesFromArray();
//        System.out.println(filteredElements);
//        System.out.println(ls.numbersList);
//        System.out.println(ls.getElementsSorted(true));
//        System.out.println(ls.getElementsSorted(false));
    }

}
