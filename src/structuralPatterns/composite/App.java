package structuralPatterns.composite;

public class App {

    public static void main(String[] args) {

        Tree tree = new Tree();
        Stick stick = new Stick();
        Leaf leaf = new Leaf();

        Composite composite = new Composite();
        composite.add(tree);
        composite.add(stick);
        composite.add(leaf);

        composite.show();
    }
}
