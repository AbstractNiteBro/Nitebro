package com.EngineeringDigest.Interface;

public class dog implements animal {
    @Override
    public void eat() {
        System.out.println("dog eats chicken");
    }

    @Override
    public void sleep() {
        System.out.println("dog sleep on couch");
    }

    @Override
    public void sound() {
        System.out.println("dog barks");
    }
}
