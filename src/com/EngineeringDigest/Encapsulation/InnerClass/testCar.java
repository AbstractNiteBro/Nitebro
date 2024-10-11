package com.EngineeringDigest.Encapsulation.InnerClass;

public class testCar {
    public static void main(String[] args) {
        car car = new car("tata");
        car.Engine engine = car.new Engine();
        engine.start();
        engine.stop();
    }
}
