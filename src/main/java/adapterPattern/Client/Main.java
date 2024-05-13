package adapterPattern.Client;

import adapterPattern.Adaptee.WeightMachineForBabies;
import adapterPattern.Adapter.WeightMachineAdapter;
import adapterPattern.Adapter.WeightMachineAdapterImpl;

public class Main {

    public static void main(String[] args) {

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());

        double weight = weightMachineAdapter.getWeightInKg();
        System.out.println("weight: " + weight);
    }
}
