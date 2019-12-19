package lambdaStream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
        return null;
    }
    public Integer getMinFromList(){
        return null;
    }
    public Integer getAvgFromList(){
        return null;
    }
    public static void main(String[] args) {
        LambdaStream ls = new LambdaStream();
        ls.getAllValuesArray();
        System.out.println();
        ls.getAllValuesList();
        System.out.println();
        List<Integer> filteredElements = ls.getPositiveValuesFromArray();
        System.out.println(filteredElements);
        System.out.println(ls.numbersList);
        System.out.println(ls.getElementsSorted(true));
        System.out.println(ls.getElementsSorted(false));
    }

}
