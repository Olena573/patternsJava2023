package facade;

public class Facade {
    SystemFirst systemFirst;
    SystemSecond systemSecond;

    public Facade (SystemFirst systemFirst, SystemSecond systemSecond){
        this.systemFirst = systemFirst;
        this.systemSecond = systemSecond;
    }

    void firstOperator(){
        systemFirst.operatorFirst();

    }

    void secondOperator(){
        systemSecond.operatorSecond();
    }

    void bothOperators(){
        systemFirst.operatorFirst();
        systemSecond.operatorSecond();
    }

}
