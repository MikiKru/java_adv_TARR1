package lambdaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class LambdaStream {
    int numbers [] = {5,4,6,3,2,13,2};
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
        names.forEach(n -> System.out.printf("%s ",n.toUpperCase()));
    }

    public static void main(String[] args) {
        LambdaStream ls = new LambdaStream();
        ls.getAllValuesArray();
        System.out.println();
        ls.getAllValuesList();
    }
}
