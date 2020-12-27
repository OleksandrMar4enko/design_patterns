package structuralPatterns.decorator;

public class PizzaWithSausages extends PizzaDecorator {

    public PizzaWithSausages(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + " +Sausages";
    }
}
