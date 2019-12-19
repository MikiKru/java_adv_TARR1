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
                    .filter(value -> value > 0)         // filtrowanie wartości większych od zera
                    .collect(Collectors.toList());
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
    }

}
