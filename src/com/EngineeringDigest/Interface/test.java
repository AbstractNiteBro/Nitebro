package com.EngineeringDigest.Interface;

public class test {
    public static void main(String[] args) {
        animal dog = new dog();
        dog.eat();
        dog.sleep();
        dog.sound();
        System.out.println();
        animal cat = new cat();
        cat.eat();
        cat.sleep();
        cat.sound();

    }
}
