package practiceProblem05_contd;

public class contd1 {
    private String owner;
    private String brand;
    private String serialNumber;
    private boolean isRunning;
    private double fuelLevel; // in percentage (0 to 100)

    public contd1(String owner, String brand, String serialNumber, double fuelLevel) {
        this.owner = owner;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.fuelLevel = fuelLevel;
        this.isRunning = false;
    }

    public void startCar() {
        if (fuelLevel > 0) {
            if (!isRunning) {
                isRunning = true;
                System.out.println("The car has started.");
            }
            else  {
                System.out.println("The car is already running.");
            }
        }
        else {
            System.out.println("Cannot start the car. Fuel tank is empty.");
        }
    }

    public void stopCar() {
        if (isRunning) {
            isRunning = false;
            System.out.println("The car has stopped.");
        }
        else {
            System.out.println("The car is already off.");
        }
    }


    public void checkFuel() {
        System.out.println("Current fuel level: " + String.format("%.2f", fuelLevel) + "%");

    }


    public void refuel(double amount) {
        if (amount <= 0) {
            System.out.println("Refuel amount must be greater than zero.");
        } else {
            fuelLevel = Math.min(100, fuelLevel + amount);
            System.out.println("Refueled. Current fuel level: " + String.format("%.2f", fuelLevel) + "%");

        }
    }


    public void displayInfo() {
        System.out.println("Owner: " + owner);
        System.out.println("Brand: " + brand);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Fuel Level: " + fuelLevel + "%");

    }
}
