package creationalPatterns.builder.builder;

import creationalPatterns.builder.simpleBuilder.Transmission;

public class SubaruBuilder extends CarBuilder {


    void buildMake() {
        car.setMake("Subaru");
    }

    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    void buildMaxSpeed() {
        car.setMaxSpeed(320);
    }
}
