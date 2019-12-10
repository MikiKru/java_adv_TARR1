package classExtends;

public class Main {
    public static void main(String[] args) {
        // utworzenie obiektu Auto
        Auto a = new Auto("VW", "Passat", "1.9 TDI", "Diesel", 150000);
        System.out.println(a.getClass());
        System.out.println(a);
    }
}
