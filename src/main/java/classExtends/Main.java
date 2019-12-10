package classExtends;

public class Main {
    public static void main(String[] args) {
        // utworzenie obiektu Auto
        Auto a = new Auto("VW", "Passat", "1.9 TDI", "Diesel", 150000);
        System.out.println(a.getClass());
        System.out.println(a);
        // utworznei obiektu klasy dziedziczącej po Auto
        AdditionSets as = new AdditionSets("BMW","5", "2.5 TDI", "Diesel", 250000);
        System.out.printf("%s %s\n", as.brand, as.model);
        System.out.println(as.toString());
    }
}
