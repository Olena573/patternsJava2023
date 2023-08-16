package Adapter;

public class Adapter implements Target {
    private final Adapt adapt;

    public Adapter (Adapt adapt){
        this.adapt = adapt;
    }

    @Override
    public void request(){
        adapt.specialRequest();

    }
}
