package behavioralPatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private List<Memento> list = new ArrayList<>();

    public void add(Memento memento) {
        list.add(memento);
    }

    public Memento get(int index) {
        return list.get(index);
    }

}
