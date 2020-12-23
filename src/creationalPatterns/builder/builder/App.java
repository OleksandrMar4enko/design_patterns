package creationalPatterns.builder.builder;

import creationalPatterns.builder.simpleBuilder.Car;

public class App {

    public static void main(String[] args) {

        Director director = new Director();
        director.setBuilder(new SubaruBuilder());
        Car car = director.buildCar();

        System.out.println(car);
    }
}
