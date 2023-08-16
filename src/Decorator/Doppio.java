package Decorator;

public class Doppio extends CondimentDecorator{
    Beverage beverage;

    public Doppio(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost(){
        return 0.20 + beverage.cost();
    }

    @Override
    public String getDescription(){
        return beverage.getDescription();
    }

}
