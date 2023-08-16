package strategy;

import java.util.Arrays;

public class ArraySort implements SortingStrategy {

    @Override
    public void sort (int [] number){
        Arrays.sort(number);
    }
}
