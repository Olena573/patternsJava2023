package strategy;

public class BubbleSort implements SortingStrategy{
    @Override
    public void sort (int[] number){
        for (int i = 0; i < number.length - 1; ++i){
            for (int j = 0; j < number.length - i - 1; ++j){
                if (number[j + 1 ] < number [j]){
                    int tmp = number[j];
                    number[j] = number [j + 1];
                    number[j + 1] = tmp;
                }
            }
        }
        System.out.println("You use bubble sorting.");
    }
}
