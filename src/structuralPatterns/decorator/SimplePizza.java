package structuralPatterns.decorator;

public class SimplePizza implements Pizza {

    @Override
    public double getCost() {
        return 4.5;
    }

    @Override
    public String getIngredients() {
        return "Pizza";
    }
}
