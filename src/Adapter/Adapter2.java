package Adapter;

public class Adapter2 implements Target {

    private final Adapt2 adapt2;

    public Adapter2 (Adapt2 adapt2){
        this.adapt2 = adapt2;
    }

    @Override
    public void request(){
        adapt2.notSpecialRequest();

    }
}
