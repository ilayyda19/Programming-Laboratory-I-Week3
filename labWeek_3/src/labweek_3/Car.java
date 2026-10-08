package labweek_3;


public class Car {
    private String plateNumber;
    private String model;
    private double mileage;
    private double fuelLevel;
    private double tankCapacity;

   
    public Car(String plateNumber, String model, double fuelLevel, double tankCapacity) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.mileage = 0.0; 
        this.tankCapacity = tankCapacity;

        
        if (fuelLevel > tankCapacity) {
            this.fuelLevel = tankCapacity;
            System.out.println("Initial fuel exceeded tank capacity. Tank filled to maximum.");
        } else {
            this.fuelLevel = fuelLevel;
        }
    }

    
    
    public void drive(double km) {
        if (km <= 0) {
            System.out.println("Invalid distance! Distance must be greater than 0.");
            return;
        }

        double requiredFuel = km / 10.0;

        if (requiredFuel > fuelLevel) {
            System.out.println("Not enough fuel for this trip!");
        } else {
            fuelLevel -= requiredFuel;
            mileage += km;
            System.out.printf("Successfully drove %.1f km. Fuel consumed: %.1f liters.%n", km, requiredFuel);
        }
    }

   
    public void refuel(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid fuel amount! Amount must be greater than 0");
            return;
        }

        if (fuelLevel + amount > tankCapacity) {
            fuelLevel = tankCapacity;
            System.out.println("Tank is full, extra fuel discarded.");
        } else {
            fuelLevel += amount;
            System.out.printf("Added %.1f liters of fuel.%n", amount);
        }
    }

    
    public void checkStatus() {
        System.out.println("--- Car Status [" + plateNumber + " - " + model + "] ---");
        System.out.printf("Mileage : %.1f km%n", mileage);
        System.out.printf("Fuel Level   : %.1f / %.1f L%n", fuelLevel, tankCapacity);

        
        if (fuelLevel < (tankCapacity * 0.10)) {
            System.out.println("Low fuel warning!");
        }
        

    }
}
