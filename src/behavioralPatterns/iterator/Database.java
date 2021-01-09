package behavioralPatterns.iterator;

public class Database implements Container {

    private String[] content =
            {"Roger", "Andrew", "Nicolas"};

    @Override
    public Iterator getIterator() {
        return new DatabaseIterator();
    }

    private class DatabaseIterator implements Iterator {

        private int index;

        @Override
        public boolean hasNext() {
            return index < content.length;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return content[index++];
            }
            return null;
        }
    }
}
