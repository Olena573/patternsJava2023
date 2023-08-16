package Singleton;

public class Main {
    //Singleton

    public static void main (String [] args){
        SingletonFirst first = SingletonFirst.getInstance();
        SingletonFirst second = SingletonFirst.getInstance();
        System.out.println (first);
        System.out.println(second);

    }
}
