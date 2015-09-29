import java.util.Date;

public class Vehicle {

    private String brand;
    private String model;
    private String engine;
    private int numberOfWheels;
    private int numberOfSeats;
    private Date lastTimeEngineChanged;

    public Vehicle(String brand, String model)
    {
        this.brand = brand;
        this.model = model;

        setAppropriateNumberOfWheels();
    }

    public Vehicle(String brand, String model, String engine)
    {
        this(brand, model);
        this.engine = engine;
    }

    public Vehicle(String brand, String model, String engine, int numberOfSeats)
    {
        this(brand, model, engine);
        this.numberOfSeats = numberOfSeats;
    }

    private void setAppropriateNumberOfWheels()
    {
        if (this.brand == "suzuki" && this.model == "gsx")
        {
            this.numberOfWheels = 2;
        }
        else
        {
            this.numberOfWheels = 4;
        }
    }

    public String getEngine()
    {
        return this.engine;
    }

    public String getDescription()
    {
        return this.brand + " " + this.model;
    }

    public void changeEngine(String engine)
    {
        this.engine = engine;
        this.lastTimeEngineChanged = new Date();
    }

}
