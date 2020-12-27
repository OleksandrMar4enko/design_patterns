package structuralPatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private List<Component> composite = new ArrayList<>();

    public void add(Component component) {
        composite.add(component);
    }

    @Override
    public void show() {
        for (Component component : composite) {
            component.show();
        }
    }
}
