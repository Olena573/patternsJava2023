package strategy;

import java.util.Arrays;

public class MainArray {

    public static void main (String [] args){
        int [] arr = new int [] {4, 6, 2, 1, 5};

        SortingContext sortingContext = new SortingContext();
        sortingContext.setStrategy(new BubbleSort());
        sortingContext.executionsStrategy(arr);
        System.out.println(Arrays.toString(arr));

        SortingContext sortingContext2 = new SortingContext();
        sortingContext2.setStrategy(new ArraySort());
        sortingContext2.executionsStrategy(arr);
        System.out.println(Arrays.toString(arr));

    }
}
