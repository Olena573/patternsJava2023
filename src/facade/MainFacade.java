package facade;

public class MainFacade {
    public static void main (String [] args){
      //  SystemFirst first = new SystemFirst();
       // SystemSecond second = new SystemSecond();

        //Facade facade = new Facade(first, second);

        Facade facade = new Facade(new SystemFirst(), new SystemSecond());

        facade.firstOperator();
        facade.secondOperator();
        facade.bothOperators();
    }
}
