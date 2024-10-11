package com.EngineeringDigest.Encapsulation.staticNestedClass;

public class test {
    public static void main(String[] args) {
        computer computer = new computer("HP","S44S14","windows");
        computer.getOs().displayInfo();

    }
}
