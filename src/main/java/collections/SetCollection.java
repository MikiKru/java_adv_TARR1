package collections;

import java.util.*;

public class SetCollection {
    private Set<Double> set1 = new HashSet<>(Arrays.asList(3.5, 2., 2.2, 11.1));
    private Set<Double> set2 = new HashSet<>(Arrays.asList(2., 11.1, 1.1, 0.9));
    private Set<Integer> set3 = new HashSet<>(Arrays.asList(2,1,3));
    public void setOperations(){
        Set<Double> sum = new HashSet<>(set1);
        // suma zbiorów
        sum.addAll(set2);
        System.out.println(sum);
        Set<Double> symDiff = new HashSet<>(sum);   // tu jest S1 suma S2
        Set<Double> retain = new HashSet<>(set1);
        retain.retainAll(set2);     // tu jest S1 część wspólna S2
        symDiff.removeAll(retain);
        System.out.println(symDiff);
        System.out.println(symDiff.contains(5.5));
    }
    Set<Set<String>> setOfSets = new HashSet<>(Arrays.asList(
            new HashSet<>(Arrays.asList("Ala","Ola")),
            new HashSet<>(Arrays.asList("Jan", "Ala"))
    ));
    public void getElements(){
        for (Set<String> s: setOfSets) {
            System.out.println(s);
        }
    }
    List<Collection<Object>> universalList = new ArrayList<>();

    public static void main(String[] args) {
        SetCollection sc = new SetCollection();
//        sc.setOperations();
        sc.getElements();
        sc.universalList.add(new HashSet<>());
        sc.universalList.add(new ArrayList<>());
        sc.universalList.add(new ArrayDeque<>());
        System.out.println(sc.universalList);
        for(Integer i : sc.set3) {
            sc.set1.add(i.doubleValue());
        }
        System.out.println(sc.set1);
    }
}
