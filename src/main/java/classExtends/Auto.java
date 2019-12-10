package classExtends;

public class Auto extends Object {     // każda klasa dziedziczy metody stn z nadklasy Object
    public String brand, model, engineType, fuelType;
    public double price_net;
    // konstruktor
    public Auto(String brand, String model, String engineType, String fuelType, double price_net) {
        System.out.println("Jestem w konstruktorze Auto");
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
        this.fuelType = fuelType;
        this.price_net = price_net;
    }
    // toString
    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineType='" + engineType + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", price_net=" + price_net +
                '}';
    }
}
