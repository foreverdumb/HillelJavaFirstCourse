package com.hillel.homework_13.polymorphism;

public class ClassicalMusicClass extends MusicStyleClass {
    @Override
    public void playMusic() throws InterruptedException {
        System.out.println("This option will play classical song");
        System.out.println("Now is playing - ClassicalSong.mp3");
        Thread.sleep(2000);
        System.out.println("The song ended");
    }
}
