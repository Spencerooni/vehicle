
public class Engine {
    public float capacity;
    public float width;
    public float height;
    public String fuelType;
    public String brand;

    public Engine(String brand, String fuelType)
    {
        this.brand = brand;
        this.fuelType = fuelType;
    }

    public String getDescription()
    {
        return brand + " " + fuelType;
    }
}
