package factoryPattern;

import factoryPattern.Factory.GetPlan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

    public static void main(String[] args) throws IOException {

        GetPlan plan = new GetPlan();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name of the plan");
        String planName = br.readLine();

        System.out.println("Enter number of units consumed");
        int units = Integer.parseInt(br.readLine());

        Plan p = plan.getPlan(planName);
        System.out.println("Bill amount for " + planName + " of " + units + "units is: ");
        p.getRate();
        p.calculateBill(units);

    }
}
