package adapterPattern.Adaptee;

public class WeightMachineForBabies implements WeighingMachine {

    @Override
    public double getWeightInPound() {
        return 5;
    }
}
