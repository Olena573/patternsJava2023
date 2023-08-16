package Iterator;

public class MainIterator {
    public static void main (String [] args){
        MyCollection collection = new MyCollection(new String[]{"String1", "String2", "String3"});

        for (String item : collection){
            System.out.println(item);
        }
    }
}
