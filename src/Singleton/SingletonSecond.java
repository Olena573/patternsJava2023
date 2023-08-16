package Singleton;

public class SingletonSecond {

    private static volatile SingletonSecond singletonSecond;

    private SingletonSecond (){}

    public static synchronized SingletonSecond getInstance (){
        if (singletonSecond == null){
            synchronized (SingletonSecond.class){
                if (singletonSecond == null){
                    singletonSecond = new SingletonSecond();
                }
            }
        }
        return singletonSecond;
    }

}
