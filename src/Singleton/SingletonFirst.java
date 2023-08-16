package Singleton;

public class SingletonFirst {

    private static SingletonFirst singletonFirst;
    private String name;

    private SingletonFirst (String name){
        this.name = name;
    }

    public static SingletonFirst getInstance (){
        if (singletonFirst == null){
            singletonFirst = new SingletonFirst ("SomeName");
        }
        return singletonFirst;
    }
}
