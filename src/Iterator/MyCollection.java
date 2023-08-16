package Iterator;

import java.util.Iterator;

public class MyCollection implements Iterable <String> {
    private final String [] items;

    public MyCollection(String[]items){
        this.items = items;
    }

    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator <String> {

        private int index;

        @Override
        public boolean hasNext(){
            return index <items.length;
        }

        @Override
        public String next(){
            return items [index ++];
        }
    }
}
