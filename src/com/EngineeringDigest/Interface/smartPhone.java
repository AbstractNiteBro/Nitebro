package com.EngineeringDigest.Interface;

public class smartPhone implements camera, phone, musicPlayer{

    @Override
    public void takePhoto() {
        System.out.println("capture photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("record video");

    }

    @Override
    public void playMusic() {
        System.out.println("play music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("pause music");
    }

    @Override
    public void call() {
        System.out.println("calling");
    }
}
