package strategyPattern;

import strategyPattern.Strategy.DriveStrategy;
import strategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
