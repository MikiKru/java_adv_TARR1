package tests;

import java.util.ArrayList;
import java.util.List;
public class JavaSETest {
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        elements.add(1);
        Integer firstElmnt = elements.get(1);
        System.out.println(firstElmnt);
    }
}