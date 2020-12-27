package structuralPatterns.decorator;

public class PizzaWithMushrooms extends PizzaDecorator {

    public PizzaWithMushrooms(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " +Mushrooms";
    }
}
