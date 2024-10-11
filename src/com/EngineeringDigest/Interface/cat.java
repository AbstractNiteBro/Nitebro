package com.EngineeringDigest.Interface;



public class cat implements animal{
    @Override
    public void eat() {
        System.out.println("cat eats fish");
    }

    @Override
    public void sleep() {
        System.out.println("cat sleep i n catHouse");
    }

    @Override
    public void sound() {
        System.out.println("cat do meao");
    }
}
