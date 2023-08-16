package Adapter;

public class MainAdapt {
    //Adapters;

    public static void main (String[] args){
        Adapt adapt = new Adapt();
        Adapt2 adapt2 = new Adapt2();

        Target target = new Adapter(adapt);
        Target target2 = new Adapter2(adapt2);

        target.request();
        target2.request();

    }
}
