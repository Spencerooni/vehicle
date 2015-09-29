public class Main {

    public static void main(String[] args) {

        Vehicle myVehicle = new Vehicle("Mazda", "mx5", "1.8 petrol");

        System.out.println(myVehicle.getEngine());

        myVehicle.changeEngine("2.0 petrol");

        System.out.println(myVehicle.getEngine());
    }
}
