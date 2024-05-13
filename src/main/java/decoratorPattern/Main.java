package decoratorPattern;

import decoratorPattern.Base.BasePizza;
import decoratorPattern.Base.Farmhouse;
import decoratorPattern.Decorator.ExtraCheese;
import decoratorPattern.Decorator.Mushroom;

public class Main {

    public static void main(String[] args) {

        BasePizza myCustomPizza = new Mushroom(new ExtraCheese(new Farmhouse()));

        System.out.println(myCustomPizza.cost());



    }
}
