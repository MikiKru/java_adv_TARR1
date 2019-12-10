package classExtends;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class AdditionSets extends Auto {
    public Map<String, Double> autoEqipment;

    public AdditionSets(String brand, String model,
            String engineType, String fuelType, double price_net) {
        // super -> wywołanie konstruktora klasy Auto
        super(brand, model, engineType, fuelType, price_net);
        autoEqipment = new HashMap<>();
        System.out.println("jestem w kontruktorze AdditionSets");
    }
}
