package lambdaStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class LambdaStramOptional {
    String sentence = "Ala ma kota a kot ma Alę i innego kota i psa";

    // wypisz słowa w sentencji
    public void getAllWords(){
        new ArrayList<String>(Arrays.asList(sentence.split(" ")))
                .forEach(s -> System.out.printf("%s | ", s));
    }
    // zlicz ile razy w napisie występuję słowo kota
    public long countWordQuantityInSentence(String word){
        return new ArrayList<String>(Arrays.asList(sentence.split(" ")))    // List<String>
                    .stream()                                                    // stream
                    .filter(s -> s.toLowerCase().equals(word.toLowerCase()))
                    .count();
    }
    // zlicz ile razy w napisie występuję słowo kot i jego odmiany
    String regex = "^[kK][oO][tT].*";
    Pattern pattern = Pattern.compile(regex);   // wzorzec który decyduje o podobieństwie wrazów

    public long countRegexQuantityInSentence(){
        return new ArrayList<String>(Arrays.asList(sentence.split(" ")))    // List<String>
                .stream()                                                    // stream
                .filter(s -> pattern.matcher(s).matches())
                .count();
    }
    public List<String> getListRegexKot(){
        return new ArrayList<String>(Arrays.asList(sentence.split(" ")))    // List<String>
                .stream()                                                    // stream
                .filter(s -> pattern.matcher(s).matches())
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        LambdaStramOptional lso = new LambdaStramOptional();
        lso.getAllWords();
        System.out.println();
        System.out.printf("Częstotliwość kota %d \n", lso.countWordQuantityInSentence("KOTA"));
        System.out.printf("Częstotliwość pochodnej kota %d \n", lso.countRegexQuantityInSentence());
        System.out.println(lso.getListRegexKot());

    }


}

