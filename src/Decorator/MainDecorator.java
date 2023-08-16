package Decorator;

public class MainDecorator {
    //Decorator

    public static void main (String[] args){
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);

        System.out.println("This " + beverage.getDescription() + " costs - " + beverage.cost());
    }

}
