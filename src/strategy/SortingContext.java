package strategy;

public class SortingContext {
    private SortingStrategy strategy;
    public void setStrategy (SortingStrategy strategy){
        this.strategy = strategy;
    }

    public void executionsStrategy (int [] numbers){
        strategy.sort(numbers);
    }
}
