package com.EngineeringDigest.Encapsulation.InnerClass;

public class testCar2 {
    public static void main(String[] args) {
        car2 car = new car2("mers");
        Engine engine = new Engine(car);
        engine.start();
        engine.stop();

        car2 car1 = new car2("lambo");
        Engine engine1 = new Engine(car1);
        engine1.start();
        engine.stop();

    }
}
