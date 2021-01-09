package behavioralPatterns.iterator;

public class App {

    public static void main(String[] args) {

        Database database = new Database();

        for (Iterator iterator = database.getIterator(); iterator.hasNext();) {
            String item = String.valueOf(iterator.next());
            System.out.printf("Database item: %s %n", item);
        }
    }

}
