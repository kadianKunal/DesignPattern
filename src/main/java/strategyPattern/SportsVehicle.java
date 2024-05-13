package strategyPattern;

import strategyPattern.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
