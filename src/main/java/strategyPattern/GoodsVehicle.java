package strategyPattern;

import strategyPattern.Strategy.DriveStrategy;
import strategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

    GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
