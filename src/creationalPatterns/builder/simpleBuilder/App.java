package creationalPatterns.builder.simpleBuilder;

public class App {

    public static void main(String[] args) {

        Car car = new CarBuilder()
                .buildMake("Mercedes")
//                .buildTransmission(Transmission.AUTO)
                .buildMaxSpeed(280)
                .build();

        System.out.println(car);
    }
}
