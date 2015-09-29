public class Main {

    public static void main(String[] args) {

        Engine engine = new Engine("ford", "petrol");

        Engine ferrariEngine = new Engine("ferrari", "petrol");

        Vehicle myVehicle = new Vehicle("Mazda", "mx5", engine);

        System.out.println(myVehicle.getEngine().getDescription());

        myVehicle.changeEngine(ferrariEngine);

        System.out.println(myVehicle.getEngine().getDescription());
    }
}
