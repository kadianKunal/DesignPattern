package adapterPattern.Adapter;

import adapterPattern.Adaptee.WeighingMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {

    WeighingMachine weighingMachine;

    public WeightMachineAdapterImpl(WeighingMachine weighingMachine) {
        this.weighingMachine = weighingMachine;
    }

    @Override
    public double getWeightInKg() {
        return this.weighingMachine.getWeightInPound()* 0.45;
    }
}
