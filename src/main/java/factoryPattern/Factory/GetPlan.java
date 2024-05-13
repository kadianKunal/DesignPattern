package factoryPattern.Factory;

import factoryPattern.Commercial;
import factoryPattern.Domestic;
import factoryPattern.Plan;

public class GetPlan {

    public Plan getPlan(String planType){
        if(planType == null){
            return null;
        }
        if(planType.equalsIgnoreCase("DOMESTIC")){
            return new Domestic();
        } else if(planType.equalsIgnoreCase("COMMERCIAL")){
            return new Commercial();
        }
        return null;
    }
}
