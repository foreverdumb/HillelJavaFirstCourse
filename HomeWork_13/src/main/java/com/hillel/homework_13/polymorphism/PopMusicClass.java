package com.hillel.homework_13.polymorphism;

public class PopMusicClass extends MusicStyleClass {
    @Override
    public void playMusic() throws InterruptedException {
        System.out.println("This option will play song that is popular now");
        System.out.println("Now is playing - PopularSong.mp3");
        Thread.sleep(2000);
        System.out.println("The song ended");
    }
}
