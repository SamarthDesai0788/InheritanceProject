package Basic;

public class Vehicle {
		    private String make;
		    private String vehicleNumber;
		    private String fuelType;
		    private Integer fuelCapacity;
		    private Integer cc;

		    public Vehicle(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc) {
		        this.make = make;
		        this.vehicleNumber = vehicleNumber;
		        this.fuelType = fuelType;
		        this.fuelCapacity = fuelCapacity;
		        this.cc = cc;
		    }

		    public void displayMake() {
		        System.out.println("Make: " + make);
		    }

		    public void displayBasicInfo() {
		        System.out.println("Vehicle Number: " + vehicleNumber);
		        System.out.println("Fuel Type: " + fuelType);
		        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
		        System.out.println("CC: " + cc);
		    }

		    public static void main(String[] args) {
		        Vehicle myVehicle = new Vehicle("Toyota", "XYZ123", "Petrol", 50, 1500);
		        myVehicle.displayMake();
		        myVehicle.displayBasicInfo();
		    }
}