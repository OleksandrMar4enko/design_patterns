package structuralPatterns.decorator;

public class App {


    public static void main(String[] args) {


        Pizza simplePizza = new SimplePizza();
        System.out.printf("Ingredients: %s %nCost: $%.2f %n", simplePizza.getIngredients(), simplePizza.getCost());

        Pizza pizzaWithMushrooms = new PizzaWithMushrooms(new SimplePizza());
        System.out.printf("Ingredients: %s %nCost: $%.2f %n", pizzaWithMushrooms.getIngredients(), pizzaWithMushrooms.getCost());

        Pizza pizzaWithAllIngridients = new PizzaWithSausages(new PizzaWithMushrooms(new SimplePizza()));
        System.out.printf("Ingredients: %s %nCost: $%.2f", pizzaWithAllIngridients.getIngredients(), pizzaWithAllIngridients.getCost());

    }
}
