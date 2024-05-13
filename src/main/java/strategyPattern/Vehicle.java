package strategyPattern;

import strategyPattern.Strategy.DriveStrategy;

public abstract class Vehicle {

    private final DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
